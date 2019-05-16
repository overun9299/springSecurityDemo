package overun.service;

import overun.model.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 14:37
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
public interface UserService{

    /**
     * 通过用户名查询用户
     * @param name
     * @return
     */
    User fandUserByName(String name);


    /**
     * 获取全部用户
     * @return
     */
    List<User> getAllUsers();
}
