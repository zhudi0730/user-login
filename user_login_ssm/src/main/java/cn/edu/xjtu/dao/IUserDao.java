package cn.edu.xjtu.dao;

import cn.edu.xjtu.domain.User;

import java.util.List;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:16
 * @Desc
 */
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 通过姓名查询用户
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
