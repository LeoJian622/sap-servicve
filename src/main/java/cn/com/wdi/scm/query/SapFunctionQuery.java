package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * SAP函数查询条件对象
 *
 * @author liyongjian
 * @date 2020-05-25 17:15
 */

@Data
@Builder
public class SapFunctionQuery {

    private String callName;

    private String functionName;
}
