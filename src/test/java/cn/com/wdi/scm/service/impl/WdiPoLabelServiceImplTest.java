package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.query.WdiPoLabelQuery;
import cn.com.wdi.scm.service.WdiPoLabelService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class WdiPoLabelServiceImplTest {

    @Autowired
    WdiPoLabelService wdiPoLabelService;

    @Test
    void selectByDocCreatorName() {
        try {
            WdiPoLabelQuery wdiPoLabelQuery = WdiPoLabelQuery.builder().name("管理员").build();
            List<WdiPoLabel> re = wdiPoLabelService.selectByWdiPoLabelQuery(wdiPoLabelQuery);
            re.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void search() {
        WdiPoLabelQuery wdiPoLabelQuery = WdiPoLabelQuery.builder().name("管理员").material("1T397-B1-01").build();
        System.out.println(wdiPoLabelService.search(wdiPoLabelQuery));
    }
}