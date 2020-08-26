<%--
  Created by IntelliJ IDEA.
  User: zhudi
  Date: 2020/8/26
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="row margin-top-20">
        <table class="table" border="1" cellspacing="0">
            <thead>
            <tr>
                <th class="seq">id</th>
                <th>username</th>
                <th>password</th>
            </tr>
            </thead>
            <tbody>
            </tbody>
            <c:forEach var="user" items="${list}" varStatus="loop">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
