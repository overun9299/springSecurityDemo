package overun.exception;

/**
 * @ClassName: SecurityConfig
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 11:06
 * @Copyright:
 */
public class AuthException extends Exception{
    private String msg;
    public AuthException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
