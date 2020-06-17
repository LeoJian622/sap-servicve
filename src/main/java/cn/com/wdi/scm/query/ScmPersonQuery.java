package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * @author liyongjian
 * @date 2020-05-26 15:25
 */

@Data
@Builder
public class ScmPersonQuery {

    private String name;

    private String userName;

    private String phone;

    private String telephone;

    private String address;

    private Byte enabled;

    private Byte locked;

}
