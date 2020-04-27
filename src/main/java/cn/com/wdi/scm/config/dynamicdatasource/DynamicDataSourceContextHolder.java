package cn.com.wdi.scm.config.dynamicdatasource;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类为数据源上下文配置，用于切换数据源
 *
 * @author liyongjian
 * @create 2020-03-17 10:27
 */

public class DynamicDataSourceContextHolder {
    /**
     * Maintain variable for every thread, to avoid effect other thread
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>() {

        /**
         * 将 master 数据源的 key 作为默认数据源的 key
         */
        @Override
        protected String initialValue() {
            return DataSourceTypeEnum.MASTER.getValue();
        }
    };

    /**
     * 数据源的 key 集合，用于切换时判断数据源是否存在
     */
    public static List<Object> dataSourceKeys = new ArrayList<>();

    /**
     * To switch DataSource
     *
     * @param key the key
     */
    public static void setDataSourceKey(String key) {
        contextHolder.set(key);
    }

    /**
     * Get current DataSource
     *
     * @return data source key
     */
    public static String getDataSourceKey() {
        return contextHolder.get();
    }

    /**
     * To set DataSource as default
     */
    public static void clearDataSourceKey() {
        contextHolder.remove();
    }

    /**
     * Check if give DataSource is in current DataSource list
     *
     * @param key the key
     * @return boolean boolean
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean containDataSourceKey(String key) {
        return dataSourceKeys.contains(key);
    }
}
