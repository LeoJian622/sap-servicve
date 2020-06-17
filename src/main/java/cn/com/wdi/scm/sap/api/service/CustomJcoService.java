package cn.com.wdi.scm.sap.api.service;

import cn.com.wdi.scm.sap.api.utils.R;

import java.util.Map;

/**
 * SAP RFC 调用服务类
 *
 * @author liyongjian
 * @create 2020-03-14 11:07
 */

public interface CustomJcoService {

    /**
     * SAP链接测试
     * @param destName 服务器名
     * @return
     */
    R pingCalls(String destName);

    /**
     * 执行SAP函数
     * @param callName 函数名
     * @param paramMap 参数
     * @return
     */
    R execute(String callName, Map<String, Object> paramMap);
}
