package cn.com.wdi.scm.config.dynamicdatasource;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.sql.DataSource;
import javax.sql.XADataSource;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据源
 *
 * @author liyongjian
 * @create 2020-03-16 17:02
 */

@Slf4j
@Configuration
public class DataSourceConfig {

    /**
     * master DataSour
     * 或 slave DataSource Bean, 但不能用于 dynamicDataSource Bean, 否则会产生循环调用
     *
     * @return data source
     * @ConfigurationProperties 注解用于从 application.properties 文件中读取配置，为 Bean 设置属性
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public XADataSource dataSourceMaster() {
        return new SQLServerXADataSource();
    }

    @Bean
    public DataSource atomikosDataSourceMaster() {
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setUniqueResourceName(DataSourceTypeEnum.MASTER.getValue());
        atomikosDataSourceBean.setXaDataSource(dataSourceMaster());
        atomikosDataSourceBean.setPoolSize(10);
        return atomikosDataSourceBean;
    }

    /**
     * ekp DataSource
     *
     * @return data source
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.slave")
    public XADataSource dataSourceSlave() {
        return new SQLServerXADataSource();
    }

    @Bean
    @DependsOn({"txManager"})
    public DataSource atomikosDataSourceSlave() {
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setUniqueResourceName(DataSourceTypeEnum.SLAVE.getValue());
        atomikosDataSourceBean.setXaDataSource(dataSourceSlave());
        atomikosDataSourceBean.setPoolSize(10);
        return atomikosDataSourceBean;
    }

    /**
     * Dynamic data source.
     *
     * @return the data source
     * @Primary 注解用于标识默认使用的 DataSource Bean，因为有三个 DataSource Bean，该注解可用于 master
     */
    @Bean
    @Primary
    @DependsOn({"txManager"})
    public DataSource dynamicDataSource() {
        DynamicRoutingDataSource dynamicRoutingDataSource = new DynamicRoutingDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>(2);
        dataSourceMap.put(DataSourceTypeEnum.MASTER.getValue(), atomikosDataSourceMaster());
        DynamicDataSourceContextHolder.dataSourceKeys.add(DataSourceTypeEnum.MASTER.getValue());
        dataSourceMap.put(DataSourceTypeEnum.SLAVE.getValue(), atomikosDataSourceSlave());
        DynamicDataSourceContextHolder.dataSourceKeys.add(DataSourceTypeEnum.SLAVE.getValue());
        // 将 master 数据源作为默认指定的数据源
        dynamicRoutingDataSource.setDefaultTargetDataSource(atomikosDataSourceMaster());
        // 将 master 和 slave 数据源作为指定的数据源
        dynamicRoutingDataSource.setTargetDataSources(dataSourceMap);

        return dynamicRoutingDataSource;
    }

    /**
     * SqlSessionFactoryBean inject dataSource
     *
     * @return
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("cn.com.wdi.scm.model.*");
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "txManager")
    public UserTransaction userTransaction() throws Throwable {
        UserTransactionImp userTransactionImp = new UserTransactionImp();
        userTransactionImp.setTransactionTimeout(10000);
        return userTransactionImp;
    }

    @Bean
    public TransactionManager atomikosTransactionManager() throws Throwable {
        UserTransactionManager userTransactionManager = new UserTransactionManager();
        userTransactionManager.setForceShutdown(false);
        return userTransactionManager;
    }

    /**
     * 配置事务管理，如果使用到事务需要注入该 Bean，否则事务不会生效
     * 在需要的地方加上 @Transactional 注解即可
     *
     * @return the platform transaction manager
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dynamicDataSource) throws Throwable {
        JtaTransactionManager jtaTransactionManager = new JtaTransactionManager(userTransaction(), atomikosTransactionManager());
        jtaTransactionManager.setAllowCustomIsolationLevels(true);
        return jtaTransactionManager;
    }

}
