package cn.com.wdi.scm.config.dynamicdatasource;

/**
 * 数据库类型名枚举
 *
 * @author ??????
 * @create 2020-03-17 14:47
 */

public enum DataSourceTypeEnum {

    /**
     * 主数据库key值枚举
     */
    MASTER("master"),
    /**
     * 辅数据库key值枚举
     */
    SLAVE("slave");

    private String value;

    DataSourceTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
