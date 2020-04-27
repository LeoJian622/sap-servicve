package cn.com.wdi.scm.config.dynamicdatasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 动态数据源切换的切面，
 * 切{@link TargetDataSource} 注解，
 * 实现数据源切换
 *
 * @author liyongjian
 * @create 2020-03-17 14:59
 */

@Aspect
@Slf4j
@Component
public class DynamicDataSourceAspect {

    /**
     * master 数据源 切点
     */
    @Pointcut("execution(* cn.com.wdi.scm.mapper.master..*.*(..))")
    private void masterAspect(){}

    /**
     * ekp 数据源 切点
     */
    @Pointcut("execution(* cn.com.wdi.scm.mapper.ekp..*.*(..))" )
    private void slaveAspect(){}

    @Before("masterAspect()")
    public void switchDataSourceMaster(JoinPoint point){
        if (!DynamicDataSourceContextHolder.containDataSourceKey(DataSourceTypeEnum.MASTER.getValue())) {
            log.error("DataSource [{}] doesn't exist, use default DataSource [{}]", DataSourceTypeEnum.MASTER.getValue(), DataSourceTypeEnum.MASTER);
        } else {
            DynamicDataSourceContextHolder.setDataSourceKey(DataSourceTypeEnum.MASTER.getValue());
            log.info("Switch DataSource to [{}] in Method [{}]",
                    DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
        }
    }

    @Before("slaveAspect()")
    public void switchDataSourceSlave(JoinPoint point){
        if (!DynamicDataSourceContextHolder.containDataSourceKey(DataSourceTypeEnum.SLAVE.getValue())) {
            log.error("DataSource [{}] doesn't exist, use default DataSource [{}]", DataSourceTypeEnum.SLAVE.getValue(), DataSourceTypeEnum.MASTER);
        } else {
            DynamicDataSourceContextHolder.setDataSourceKey(DataSourceTypeEnum.SLAVE.getValue());
            log.info("Switch DataSource to [{}] in Method [{}]",
                    DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
        }
    }

    /**
     * 注解切点定义
     */
    @Pointcut("@annotation(cn.com.wdi.scm.config.dynamicdatasource.TargetDataSource)")
    private void switchDataSourcePointcut(){}


    /**
     * Switch DataSource
     *
     * @param point 连接点
     * @param targetDataSource 目标数据源注解对象
     */
    @Before("switchDataSourcePointcut()&&@annotation(targetDataSource)")
    public void switchDataSource(JoinPoint point, TargetDataSource targetDataSource) {
        if (!DynamicDataSourceContextHolder.containDataSourceKey(targetDataSource.value())) {
            log.error("DataSource [{}] doesn't exist, use default DataSource [{}]", targetDataSource.value(), DataSourceTypeEnum.MASTER);
        } else {
            DynamicDataSourceContextHolder.setDataSourceKey(targetDataSource.value());
            log.info("Switch DataSource to [{}] in Method [{}]",
                    DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
        }
    }

    /**
     * Restore DataSource
     *
     * @param point 连接点
     */
    @After("switchDataSourcePointcut()||masterAspect()||slaveAspect()")
    public void restoreDataSource(JoinPoint point) {
        // 将数据源置为默认数据源
        DynamicDataSourceContextHolder.clearDataSourceKey();
        log.info("Restore DataSource to [{}] in Method [{}]",
                DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
    }
}
