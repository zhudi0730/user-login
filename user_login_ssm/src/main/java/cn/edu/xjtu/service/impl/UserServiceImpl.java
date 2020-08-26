package cn.edu.xjtu.service.impl;

import cn.edu.xjtu.dao.IUserDao;
import cn.edu.xjtu.domain.User;
import cn.edu.xjtu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:20
 * @Desc
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public List<User> findAll() {
        System.out.println("业务层：查询所有用户");
        return userDao.findAll();
    }

    public void saveUser(User user) {
        System.out.println("业务层：保存用户");
        userDao.saveUser(user);
    }

    public User findUserByUsername(String username) {
        System.out.println("业务层：根据用户名查询用户");
        return userDao.findUserByUsername(username);
    }
}
