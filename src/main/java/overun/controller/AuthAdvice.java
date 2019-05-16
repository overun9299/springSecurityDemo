package overun.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import overun.exception.AuthException;
import overun.model.R;

/**
 * @ClassName: SecurityConfig
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 11:06
 * @Copyright:
 */
@ControllerAdvice
public class AuthAdvice {
    @ExceptionHandler(AuthException.class)
    @ResponseBody
    public R handleAuthException(final AuthException ex) {
        R rt = new R();
        rt.setRetCode("-1");
        rt.setRetMsg(ex.getMessage());
        return rt;
    }
}
