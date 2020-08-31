<%--
  Created by IntelliJ IDEA.
  User: zhudi
  Date: 2020/8/26
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        p{
            text-align: center;
        }
        span{
            color:red;
        }

    </style>
</head>
<body>

    <h3>用户名或密码错误</h3><br>

    <p>
        <span id="time">3</span>秒之后，自动跳转到首页...
    </p>

    <script>
        var second = 3;
        var time = document.getElementById("time");
        function showTime() {
            second --;
            if (second <= 0) {
                location.href = "../index.jsp";
            }
            time.innerHTML = second + "";
        }
        setInterval(showTime, 1000);

    </script>
</body>
</html>
