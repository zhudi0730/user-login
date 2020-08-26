package cn.edu.xjtu.dao;

import cn.edu.xjtu.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:16
 * @Desc
 */
@Repository
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into user (username, password) values(#{username}, #{password})")
    void saveUser(User user);

    /**
     * 通过姓名查询用户
     * @param username
     * @return
     */
    @Select("select * from user where username=#{username}")
    User findUserByUsername(String username);
}
