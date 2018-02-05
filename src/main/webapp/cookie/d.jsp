<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/5
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除cookie</title>
</head>
<body>
    <%
        Cookie cookie = new Cookie("aaaa", "AAAA");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    %>
</body>
</html>
