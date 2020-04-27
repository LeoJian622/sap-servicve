package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmMenu;
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
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("菜单角色联合查询")
class ScmMenuMapperTest {

    @Autowired
    private ScmMenuMapper scmMenuMapper;

    @Test
    void selectOneJoin() {
    }

    @Test
    void selectManyJoin() {

        SelectStatementProvider selectStatementProvider = select(ScmMenuMapper.selectJoinRoleList)
                .from(ScmMenuDynamicSqlSupport.scmMenu)
                .leftJoin(ScmMenuRoleDynamicSqlSupport.scmMenuRole)
                .on(ScmMenuDynamicSqlSupport.id, equalTo(ScmMenuRoleDynamicSqlSupport.mid))
                .leftJoin(ScmRoleDynamicSqlSupport.scmRole)
                .on(ScmMenuRoleDynamicSqlSupport.rid, equalTo(ScmRoleDynamicSqlSupport.id))
                .orderBy(ScmMenuDynamicSqlSupport.url.descending())
                .build()
                .render(RenderingStrategies.MYBATIS3);

        List<ScmMenu> list = scmMenuMapper.selectManyJoin(selectStatementProvider);
        System.out.println(list);
    }
}