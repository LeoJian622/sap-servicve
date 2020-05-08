package cn.com.wdi.scm.exception;

import cn.com.wdi.scm.enums.ScmExceptionEnum;

/**
 * SCM系统异常类
 *
 * @author liyongjian
 * @creater 2020-04-10 12:15
 */

public class ScmException extends Exception {

    private String code;

    public ScmException(String message) {
        super(message);
        this.code = ScmExceptionEnum.SCM_NO_CODE.getCode();
    }

    public ScmException(ScmExceptionEnum scmExceptionEnum) {
        super(scmExceptionEnum.getMsg());
        this.code = scmExceptionEnum.getCode();
    }

    public ScmException(ScmExceptionEnum scmExceptionEnum, String message) {
        super(message);
        this.code = scmExceptionEnum.getCode();

    }

    public String getCode() {
        return code;
    }

}
