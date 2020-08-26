package cn.edu.xjtu.test;

import cn.edu.xjtu.service.IUserService;
import cn.edu.xjtu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:42
 * @Desc
 */
public class ServiceTest {

    @Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        userService.findAll();
    }
}
