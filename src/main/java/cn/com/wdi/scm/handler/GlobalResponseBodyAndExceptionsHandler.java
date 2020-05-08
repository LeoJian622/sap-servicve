package cn.com.wdi.scm.handler;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.vo.ReturnBodyVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * requestMap异常拦截器
 *
 * @author liyongjian
 * @create 2020-04-30 14:37
 */

@Slf4j
@RestControllerAdvice
public class GlobalResponseBodyAndExceptionsHandler{

    /** 运行异常 */
    @ExceptionHandler(RuntimeException.class)
    public ReturnBodyVO runtimeExceptionHandler(RuntimeException ex) {
        log.error("运行时异常：{}", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 空指针异常 */
    @ExceptionHandler(NullPointerException.class)
    public ReturnBodyVO nullPointerExceptionHandler(NullPointerException ex) {
        log.error("空指针异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 类型转换异常 */
    @ExceptionHandler(ClassCastException.class)
    public ReturnBodyVO classCastExceptionHandler(ClassCastException ex) {
        log.error("类型转换异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 文件未找到异常 */
    @ExceptionHandler(FileNotFoundException.class)
    public ReturnBodyVO fileNotFoundExceptionHandler(FileNotFoundException ex) {
        log.error("文件未找到异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 数字格式异常 */
    @ExceptionHandler(NumberFormatException.class)
    public ReturnBodyVO numberFormatExceptionHandler(NumberFormatException ex) {
        log.error("数字格式异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 安全异常 */
    @ExceptionHandler(SecurityException.class)
    public ReturnBodyVO securityExceptionHandler(SecurityException ex) {
        log.error("安全异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** sql异常 */
    @ExceptionHandler(SQLException.class)
    public ReturnBodyVO sQLExceptionHandler(SQLException ex) {
        log.error("sql异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 类型不存在异常 */
    @ExceptionHandler(TypeNotPresentException.class)
    public ReturnBodyVO TypeNotPresentExceptionHandler(TypeNotPresentException ex) {
        log.error("类型不存在异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** IO异常 */
    @ExceptionHandler(IOException.class)
    public ReturnBodyVO ioExceptionHandler(IOException ex) {
        log.error("IO异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 未知方法异常 */
    @ExceptionHandler(NoSuchMethodException.class)
    public ReturnBodyVO noSuchMethodExceptionHandler(NoSuchMethodException ex) {
        log.error("未知方法异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 数组越界异常 */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ReturnBodyVO indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        log.error("数组越界异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }
    /** sql语法错误异常 */
    @ExceptionHandler(BadSqlGrammarException.class)
    public ReturnBodyVO badSqlGrammarExceptionHandler(BadSqlGrammarException ex) {
        log.error("sql语法错误异常：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 无法注入bean异常 */
    @ExceptionHandler(NoSuchBeanDefinitionException.class)
    public ReturnBodyVO noSuchBeanDefinitionExceptionHandler(NoSuchBeanDefinitionException ex) {
        log.error("无法注入bean异常 ：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 栈溢出 */
    @ExceptionHandler({StackOverflowError.class})
    public ReturnBodyVO requestStackOverflowHandler(StackOverflowError ex) {
        log.error("栈溢出：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 404错误 */
    @ExceptionHandler({NoHandlerFoundException.class})
    public ReturnBodyVO requestStackOverflowHandler(NoHandlerFoundException ex) {
        log.error("栈溢出：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 除数不能为0 */
    @ExceptionHandler({ArithmeticException.class})
    public ReturnBodyVO arithmeticExceptionHandler(ArithmeticException ex) {
        log.error("除数不能为0：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** SCM错误 */
    @ExceptionHandler({ScmException.class})
    public ReturnBodyVO scmExceptionHandler(ScmException ex) {
        log.error("Scm执行错误：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }

    /** 其他错误 */
    @ExceptionHandler({Exception.class})
    public ReturnBodyVO exceptionHandler(Exception ex) {
        log.error("其他错误：{} ", ex.getMessage(), ex);
        return ReturnBodyVO.error(ex);
    }
}
