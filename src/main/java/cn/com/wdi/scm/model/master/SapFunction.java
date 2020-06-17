package cn.com.wdi.scm.model.master;

import lombok.ToString;

import javax.annotation.Generated;

@ToString
public class SapFunction {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.944+08:00", comments="Source field: sap_function.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.config_id")
    private String configId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.call_name")
    private String callName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.function_name")
    private String functionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.947+08:00", comments="Source field: sap_function.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.config_id")
    public String getConfigId() {
        return configId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.config_id")
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.call_name")
    public String getCallName() {
        return callName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.call_name")
    public void setCallName(String callName) {
        this.callName = callName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.function_name")
    public String getFunctionName() {
        return functionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.948+08:00", comments="Source field: sap_function.function_name")
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}