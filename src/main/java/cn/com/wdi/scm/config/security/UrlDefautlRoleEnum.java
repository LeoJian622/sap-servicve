package cn.com.wdi.scm.config.security;

/**
 * 默认角色枚举
 *
 * @author ??????
 * @create 2020-03-31 16:07
 */

public enum UrlDefautlRoleEnum {

    /**
     * 默认需要登录
     */
    ROLE_LOGIN("ROLE_LOGIN"),
    /**
     * 匿名用户
     */
    ROLE_ANONYMOUS("ROLE_ANONYMOUS")
    ;

    private String value;

    UrlDefautlRoleEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
