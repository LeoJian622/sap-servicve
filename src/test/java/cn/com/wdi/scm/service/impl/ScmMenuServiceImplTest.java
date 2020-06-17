package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.model.master.ScmMenu;
import cn.com.wdi.scm.service.ScmMenuService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ScmMenuServiceImplTest {

    @Autowired
    ScmMenuService scmMenuService;

    @Test
    void selectByRoleId() {
        List<ScmMenu> re = scmMenuService.selectByRoleId("2");
        System.out.println(re);
    }
}