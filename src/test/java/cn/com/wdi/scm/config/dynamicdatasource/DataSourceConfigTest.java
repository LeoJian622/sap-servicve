package cn.com.wdi.scm.config.dynamicdatasource;

import cn.com.wdi.scm.mapper.ekp.WdiPoPakeMapper;
import cn.com.wdi.scm.mapper.master.SapConfigMapper;
import cn.com.wdi.scm.mapper.master.ScmMenuMapper;
import cn.com.wdi.scm.model.ekp.WdiPoPake;
import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.model.master.ScmMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("动态数据源 分布式事物测试")
class DataSourceConfigTest {

    @Autowired
    WdiPoPakeMapper wdiPoPakeMapper;

    @Autowired
    ScmMenuMapper scmMenuMapper;

    @Autowired
    SapConfigMapper sapConfigMapper;

    @Test
    void dynamicDataTest(){
        SapConfig sapConfig = new SapConfig();
        sapConfig.setDestName("122311231123232323");
        sapConfigMapper.insert(sapConfig);
        ScmMenu scmMenu = new ScmMenu();
        scmMenuMapper.insert(scmMenu);
    }


}