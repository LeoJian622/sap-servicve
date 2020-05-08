package cn.com.wdi.scm.enums;

/**
 * 异常枚举
 *
 * @author liyongjian
 * @create 2020-04-30 15:00
 */

public enum  ScmExceptionEnum {


    /**
     * 成功代码
     */
    SUCCEED_CODE("10000","成功"),
    /**
     *系统错误代码枚举
     */
    HTTP_404("404","找不到页面"),
    SCM_NO_CODE("20000","没有异常代码"),

    SERVER_EXCEPTION("500000","运行时异常"),
    SERVER_RUNTIME_EXCEPTION("500001",""),
    SERVER_NULL_POINT_EXCEPTION("500002","空指针异常"),
    SERVER_CLASS_CAST_EXCEPTION("500003","类型转换异常"),
    SERVER_FILE_NOT_FOUND_EXCEPTION("500004","找不到文件异常"),
    SERVER_NUMBER_FORMAT_EXCEPTION("500005","数字格式异常"),
    SERVER_SECURITY_EXCEPTION("500006","安全异常"),
    SERVER_SQL_EXCEPTION("500007","SQL异常"),
    SERVER_TYPE_NOT_PRESENT_EXCEPTION("500008","类型不存在异常"),
    SERVER_IO_EXCEPTION("500009","IO异常"),
    SERVER_NO_SUCH_METHOD_EXCEPTION("500010","未知方法异常"),
    SERVER_INDEX_OUT_OF_BOUNDS_EXCEPTION("500011","数组越界异常"),
    SERVER_BAD_SQL_GRAMMAR_EXCEPTION("500012","sql语法错误异常"),
    SERVER_NO_SUCH_BEAN_DEFINITION_EXCEPTION("500013","无法注入bean异常"),
    SERVER_STACK_OVERFLOW_ERROR("500014","栈溢出"),
    SERVER_ARITHMETIC_EXCEPTION("500015","除数不能为0"),
    ;

    String code;

    String msg;

     ScmExceptionEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
