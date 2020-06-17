package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.model.master.SapFunction;
import cn.com.wdi.scm.sap.api.service.SapFunctionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SapFunctionServiceImplTest {

    @Autowired
    private SapFunctionService sapFunctionService;

    @Test
    void save() throws Exception {

        SapFunction sapFunction = new SapFunction();
        sapFunction.setCallName("tefgxhfgh2te");
        sapFunction.setConfigId("1");
        sapFunction.setFunctionName("te12st");
        sapFunctionService.save(sapFunction);
    }

    @Test
    void update() throws Exception{
        SapFunction sapFunction = new SapFunction();
        sapFunction.setId("29A89BD354CA489FB4310CECB92F61E2");
        sapFunction.setCallName("111112111111111111");
        System.out.println(sapFunctionService.update(sapFunction));
    }

    @Test
    void delete() throws Exception {
        sapFunctionService.delete("0FEED7CACC2043A182676CF447B59283");
    }
}