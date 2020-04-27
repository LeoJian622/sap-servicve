package cn.com.wdi.scm.mapper.master;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static cn.com.wdi.scm.mapper.master.SapConfigDynamicSqlSupport.*;

import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("test mysql dynamic statements")
class SapConfigMapperTest {

    @Autowired
    private SapConfigMapper sapConfigMapper;

    @Test
    void selectMany() {
        SelectStatementProvider selectStatementProvider = select(id,destName,ashost,sysnr,client,username,paswword,poolCapacity,peakLimit,sapRouter,lang)
                .from(sapConfig)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List result = sapConfigMapper.selectMany(selectStatementProvider);
        System.out.println(result);
    }
}