package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.mapper.master.SapConfigMapper;
import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.sap.api.service.SapConfigService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Description("SAP服务器增加减少测试")
class SapConfigServiceImplTest {

    @Autowired
    SapConfigMapper sapConfigMapper;

    @Autowired
    SapConfigService sapConfigService;

    @Test
    void save() throws Exception {
        SapConfig sapConfig  = sapConfigMapper.selectByPrimaryKey("1").get();
        sapConfig.setDestName("cececececec1");
        sapConfig.setId(null);
        sapConfigService.save(sapConfig);
    }

    @Test
    void update() throws Exception {
        SapConfig sapConfig  = sapConfigMapper.selectByPrimaryKey("9792AD1C2FF64E98A13EBD4FE640C544").get();
        sapConfig.setAshost("172.16.0.107");
        sapConfig.setClient("300");
        sapConfigService.update(sapConfig);
    }

    @Test
    void delete() throws Exception {
        sapConfigService.delete("AADBA8013F184FE0AE83FB8D915FE586");
    }
}