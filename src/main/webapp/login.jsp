<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/10/6
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试国际化</title>
</head>
<body>
    <%
        Locale locale = request.getLocale();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("res",locale);
    %>
    <h1><%=resourceBundle.getString("login")%></h1>
    <form action="" method="post">
        <%=resourceBundle.getString("username")%>:<input type="text" name="username"/>
        <%=resourceBundle.getString("password")%>:<input type="password" name="password"/>
        <input type="submit" value="<%=resourceBundle.getString("login")%>"/>
    </form>
</body>
</html>
