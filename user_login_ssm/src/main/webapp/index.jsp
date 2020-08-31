<%--
  Created by IntelliJ IDEA.
  User: zhudi
  Date: 2020/8/26
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--<a href="user/findAll">查询所有</a><br/>--%>

    <form action="user/login" method="post">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="password" name="password"><br/>
        <input type="submit" value="登录"><br/>
    </form>
    <a href="user/registerPage">
        <button>注册</button>
    </a>


</body>
</html>
