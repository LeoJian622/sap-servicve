package cn.com.wdi.scm.mapper.ekp;

import cn.com.wdi.scm.config.dynamicdatasource.DataSourceTypeEnum;
import cn.com.wdi.scm.config.dynamicdatasource.DynamicDataSourceContextHolder;
import cn.com.wdi.scm.config.dynamicdatasource.TargetDataSource;
import cn.com.wdi.scm.model.ekp.WdiPoIdjl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("ID记录表数据读取")
class WdiPoIdjlMapperTest {

    @Autowired
    WdiPoIdjlMapper wdiPoIdjlMapper;

    @BeforeAll
    static void init(){

    }

    @Test
    void selectMany() {
        SelectStatementProvider selectStatementProvider = select(wdiPoIdjlMapper.selectList)
                .from(WdiPoIdjlDynamicSqlSupport.wdiPoIdjl)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<WdiPoIdjl> a = wdiPoIdjlMapper.selectMany(selectStatementProvider);
        for(WdiPoIdjl w: a){
            System.out.println(w);
        }
    }
}