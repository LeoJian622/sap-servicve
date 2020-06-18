package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * @author liyongjian
 * @date 2020-06-17 15:56
 */

@Data
@Builder
public class ScmPersonRoleQuery {

    private String personId;

    private String roleId;
}
