package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.model.master.ScmRole;
import cn.com.wdi.scm.service.ScmRoleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ScmRoleServiceImplTest {

    @Autowired
    ScmRoleService scmRoleService;

    @Test
    void selectByPersonId() {
        List<ScmRole> re = scmRoleService.selectByPersonId("1");
        System.out.println(re.toString());
    }

    @Test
    void selectByMenuId() {
        List<ScmRole> re = scmRoleService.selectByMenuId("1");
        System.out.println(re.toString());
    }
}