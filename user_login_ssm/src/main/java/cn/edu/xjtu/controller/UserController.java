package cn.edu.xjtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:31
 * @Desc 账户web
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层：查询所有用户");
        return "list";
    }
}
