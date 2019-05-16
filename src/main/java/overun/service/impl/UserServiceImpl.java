package overun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import overun.mapper.UserMapper;
import overun.model.User;
import overun.model.UserExample;
import overun.service.UserService;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 14:38
 * @Copyright:
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User fandUserByName(String name) {

        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(name);

        List<User> users = userMapper.selectByExample(example);

        if (users.size()> 0 ) {
            return users.get(0);
        }
        return null;

    }

    @Override
    public List<User> getAllUsers() {

        List<User> users = userMapper.selectByExample(null);
        return users;
    }
}
