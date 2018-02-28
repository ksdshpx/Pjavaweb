<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/28
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
    <h1>哈哈，出错啦！</h1>
    <%
        exception.printStackTrace(response.getWriter());
    %>
</body>
</html>
