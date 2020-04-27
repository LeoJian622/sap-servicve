package cn.com.wdi.scm.sap.api.exception;

/**
 * SAP 自定义异常
 *
 * @author ??????
 * @create 2020-03-20 17:09
 */

public class CustomBusinessException extends Exception{

    public CustomBusinessException(){
        super();
    }

    public CustomBusinessException( String message ){
        super( message );
    }

    public CustomBusinessException( String message, Throwable throwable ){
        super( message, throwable );
    }

    public CustomBusinessException( Throwable cause ){
        super( cause );
    }

    public CustomBusinessException( String message, Throwable cause,
                                    boolean enableSuppression,
                                    boolean writableStackTrace ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
