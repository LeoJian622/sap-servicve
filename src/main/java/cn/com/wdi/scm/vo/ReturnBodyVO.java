package cn.com.wdi.scm.vo;

import cn.com.wdi.scm.enums.ScmExceptionEnum;
import cn.com.wdi.scm.exception.ScmException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;

/**
 * 统一返回体
 *
 * @author liyongjian
 * @create 2020-04-30 14:09
 */

@ApiModel(description = "统一返回体")
public class ReturnBodyVO<T> implements Serializable {

    private static final long serialVersionUID = 2613113453162530709L;


    /**
     *错误代码
     */
    @ApiModelProperty("错误代码")
    private String code;

    /**
     * 错误信息
     */
    @ApiModelProperty("错误信息")
    private String msg;

    /**
     * 数据对象
     */
    @ApiModelProperty("数据对象")
    private T data;

    private ReturnBodyVO() {
        this.setCode("0");
        this.setMsg("操作成功");
    }

    private ReturnBodyVO(ScmExceptionEnum scmExceptionEnum, T data) {
        this.setCode(scmExceptionEnum.getCode());
        this.setMsg(scmExceptionEnum.getMsg());
        this.setData(data);
    }

    /**
     * 成功返回
     */
    public ReturnBodyVO(T data) {
        this(ScmExceptionEnum.SUCCEED_CODE, data);
    }

    /**
     * SCM异常
     */
    public static ReturnBodyVO error(ScmException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ex.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 运行时异常
     */
    public static ReturnBodyVO error(RuntimeException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_RUNTIME_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 空指针异常
     */
    public static ReturnBodyVO error(NullPointerException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_NULL_POINT_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 类型转换异常
     */
    public static ReturnBodyVO error(ClassCastException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_CLASS_CAST_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 文件未找到异常
     */
    public static ReturnBodyVO error(FileNotFoundException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_FILE_NOT_FOUND_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 数字格式异常
     */
    public static ReturnBodyVO error(NumberFormatException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_NUMBER_FORMAT_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 安全异常
     */
    public static ReturnBodyVO error(SecurityException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_SECURITY_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * sql异常
     */
    public static ReturnBodyVO error(SQLException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_SQL_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 类型不存在异常
     */
    public static ReturnBodyVO error(TypeNotPresentException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_TYPE_NOT_PRESENT_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * IO异常
     */
    public static ReturnBodyVO error(IOException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_IO_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 未知方法异常
     */
    public static ReturnBodyVO error(NoSuchMethodException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_NO_SUCH_METHOD_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 数组越界异常
     */
    public static ReturnBodyVO error(IndexOutOfBoundsException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_INDEX_OUT_OF_BOUNDS_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * sql语法错误异常
     */
    public static ReturnBodyVO error(BadSqlGrammarException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_BAD_SQL_GRAMMAR_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 无法注入bean异常
     */
    public static ReturnBodyVO error(NoSuchBeanDefinitionException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_NO_SUCH_BEAN_DEFINITION_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 栈溢出
     */
    public static ReturnBodyVO error(StackOverflowError ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_STACK_OVERFLOW_ERROR.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 404错误
     */
    public static ReturnBodyVO error(NoHandlerFoundException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.HTTP_404.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 除数不能为0
     */
    public static ReturnBodyVO error(ArithmeticException ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_ARITHMETIC_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    /**
     * 其他错误
     */
    public static ReturnBodyVO error(Exception ex) {
        ReturnBodyVO returnBodyVO = new ReturnBodyVO();
        returnBodyVO.setCode(ScmExceptionEnum.SERVER_EXCEPTION.getCode());
        returnBodyVO.setMsg(ex.getMessage());
        return returnBodyVO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
