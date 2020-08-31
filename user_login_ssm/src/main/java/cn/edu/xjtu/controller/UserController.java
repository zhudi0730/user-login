package cn.edu.xjtu.controller;

import cn.edu.xjtu.domain.User;
import cn.edu.xjtu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author zhudi
 * @CreateTime 2020/8/26 10:31
 * @Desc 账户web
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有用户");
        List<User> list = userService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：保存用户");
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath() + "/user/findAll");
        return;
    }

    @RequestMapping("/login")
    public void login(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：用户登录");
        User userInDatabase = userService.findUserByUsername(username);
        if (userInDatabase == null || !userInDatabase.getPassword().equals(password)) {
            response.sendRedirect(request.getContextPath()+"/user/loginFail");
        } else {
            response.sendRedirect(request.getContextPath() + "/user/findAll");
        }
        return;
    }

    @RequestMapping("/loginFail")
    public String loginFail() {
        return "fail";
    }

    @RequestMapping("/registerPage")
    public String registerPage() {
        return "register";
    }

    @RequestMapping("/register")
    public void register(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：用户注册");
        if (userService.findUserByUsername(user.getUsername()) != null) {
            //数据库中已存在该用户名
            response.sendRedirect(request.getContextPath() + "/user/registerFail");
        } else {//否则保存该用户
            userService.saveUser(user);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }

    @RequestMapping("/registerFail")
    public String registerFail() {
        return "registerFail";
    }
}
