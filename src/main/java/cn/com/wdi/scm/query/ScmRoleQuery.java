package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * @author liyongjian
 * @date 2020-05-26 15:24
 */

@Data
@Builder
public class ScmRoleQuery {

    private String name;

    private String nameZh;
}
