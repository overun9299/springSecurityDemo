package overun.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName: Md5PasswordEncoder
 * @Description: 自定义密码比较器
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 13:57
 * @Copyright:
 */
public class Md5PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence);
    }
}
