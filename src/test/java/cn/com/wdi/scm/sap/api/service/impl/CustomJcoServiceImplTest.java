package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.sap.api.service.CustomJcoService;
import cn.com.wdi.scm.sap.api.utils.R;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("test mysql dynamic statements")
class CustomJcoServiceImplTest {

    @Autowired
    private CustomJcoService customJcoService;

    @Test
    void pingCalls() {
        R r = customJcoService.pingCalls("PRD800");
        System.out.println(r.getMsg());
    }

    @Test
    void execute() {
        Map<String,Object> input = new HashMap<>();
        Map<String,String> inputStruct = new HashMap<>();
        inputStruct.put("WERKS","1100");
        input.put("G_WERKS",inputStruct);
        R r = customJcoService.execute("teste",input);
        Map<String,Object> dataMap = (Map<String, Object>) r.getData();
        List<Map<String,String>> re = (List<Map<String, String>>) dataMap.get("OUTPUTTAB");
        int i=0;
        for (Map<String,String> t: re) {
            System.out.println("-"+(++i)+"-----------");
            System.out.println(t.toString());
            System.out.println();
        }
        System.out.println(r.getMsg());
    }

    @Test
    void init() {
    }

    @Test
    void getJcoDestination() {
    }

    @Test
    void setFunctionParameter() {
    }

    @Test
    void getExportParameterList() {
    }

    @Test
    void getTableParameterList() {
    }
}