package overun.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import overun.model.Menu;
import overun.model.User;
import overun.service.MenuService;
import overun.service.RoleService;
import overun.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CustomUserDetailsService
 * @Description: 认证和授权
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 14:12
 * @Copyright:
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        /** 认证账号 */
        User user = userService.fandUserByName(s);

        if (user == null) {
            throw new UsernameNotFoundException("账号不存在");
        }

        /** 开始授权 */
        List<Menu> menus = roleService.findMenusByUserId(user.getId());
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        for (Menu menu : menus) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(menu.getUrl());
            /** 此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。 */
            grantedAuthorities.add(grantedAuthority);
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
