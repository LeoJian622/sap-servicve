package cn.com.wdi.scm.config.dynamicdatasource;

import java.lang.annotation.*;

/**
 * 数据源注解，用于设置数据源的 key，指定使用哪个数据源
 *
 * @author liyongjian
 * @create 2020-03-17 14:42
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface TargetDataSource {
    String value();
}
