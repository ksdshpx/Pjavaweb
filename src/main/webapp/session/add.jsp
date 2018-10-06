<%@ page import="cn.ksdshpx.day20.web.listener.User" %><%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/10/6
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HttpSessionBandingListener</title>
</head>
<body>
    <%
        session.setAttribute("user",new User());
    %>
</body>
</html>
