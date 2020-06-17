package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * SAP服务器配置查询对象
 *
 * @author liyongjian
 * @date 2020-05-25 16:37
 */

@Data
@Builder
public class SapConfigQuery {

    /**
     * 服务器名称
     */
    private String destName;

    /**
     * 服务器地址
     */
    private String ashost;

    /**
     * 服务器客户端
     */
    private String client;

    /**
     * 服务器登录的用户名
     */
    private String userName;
}
