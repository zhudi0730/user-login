<%--
  Created by IntelliJ IDEA.
  User: zhudi
  Date: 2020/8/26
  Time: 21:24
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

    <h3>该用户名已存在，请重新输入</h3>

    <p>
        <span id="time">3</span>秒之后，自动跳转到注册页面...
    </p>

    <script>
        var second = 3;
        var time = document.getElementById("time");
        function showTime() {
            second --;
            if (second <= 0) {
                location.href = "registerPage";
            }
            time.innerHTML = second + "";
        }
        setInterval(showTime, 1000);

    </script>

</body>
</html>
