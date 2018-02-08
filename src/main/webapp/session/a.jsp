<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/8
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试session</title>
</head>
<body>
    <h1>向session中存放数据</h1>
    <%
        session.setAttribute("aaa","AAA");
    %>
</body>
</html>
