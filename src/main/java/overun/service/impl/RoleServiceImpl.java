package overun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import overun.mapper.MenuMapper;
import overun.mapper.RoleMapper;
import overun.mapper.RoleMenuMapper;
import overun.mapper.UserRoleMapper;
import overun.model.*;
import overun.service.RoleService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RoleServiceImpl
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 15:59
 * @Copyright:
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findMenusByUserId(Long id) {

        UserRoleExample example = new UserRoleExample();
        example.or().andUserIdEqualTo(id);
        List<UserRole> userRoles = userRoleMapper.selectByExample(example);

        List<Long> roleIds = new ArrayList<>();

        for (UserRole u : userRoles) {
            roleIds.add(u.getRoleId());
        }


        RoleMenuExample example1 = new RoleMenuExample();
        example1.or().andRoleIdIn(roleIds);
        List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(example1);

        List<Long> menuIds = new ArrayList<>();

        for (RoleMenu r : roleMenus) {
            menuIds.add(r.getMenuId());
        }

        MenuExample example2 = new MenuExample();
        example2.or().andIdIn(menuIds);

        List<Menu> menus = menuMapper.selectByExample(example2);

        return menus;

    }
}
