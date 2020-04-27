package cn.com.wdi.scm.sap;

/**
 * SAP工具包字符常量
 *
 * @author liyongjian
 * @create 2020-03-24 10:41
 */

public enum CustomJcoStringEnum {
    /**
     * 日期类型标识常量
     */
    DATA_TYPE_DATE("date"),
    ;

    private String value;

    CustomJcoStringEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
