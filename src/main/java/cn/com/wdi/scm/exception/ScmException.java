package cn.com.wdi.scm.exception;

/**
 * SCM系统异常类
 *
 * @author ??????
 * @creater 2020-04-10 12:15
 */

public class ScmException extends Exception {
    public ScmException() {
        super();
    }

    public ScmException(String message) {
        super(message);
    }

    public ScmException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ScmException(Throwable cause) {
        super(cause);
    }

    public ScmException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
