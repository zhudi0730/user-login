package cn.edu.xjtu.service.impl;

import cn.edu.xjtu.domain.User;
import cn.edu.xjtu.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:20
 * @Desc
 */
@Service("userService")
public class UserServiceImpl implements IUserService {


    public List<User> findAll() {
        System.out.println("业务层：查询所有账户");
        return null;
    }

    public void saveUser(User user) {
        System.out.println("业务层：保存账户");
    }

    public User findUserByUsername(String username) {
        System.out.println("业务层：根据用户名查询账户");
        return null;
    }
}
