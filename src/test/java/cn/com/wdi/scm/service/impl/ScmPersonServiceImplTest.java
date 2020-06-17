package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.model.master.ScmPerson;
import cn.com.wdi.scm.service.ScmPersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ScmPersonServiceImplTest {

    @Autowired
    ScmPersonService scmPersonService;

    @Test
    void selectByRoleId() {
        List<ScmPerson> re = scmPersonService.selectByRoleId("1");
        System.out.println(re);
    }
}