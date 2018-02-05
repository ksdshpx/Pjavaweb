<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/5
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>生成cookie</title>
</head>
<body>
    <%
        Cookie cookie1 = new Cookie("aaa","AAA");
        response.addCookie(cookie1);
        Cookie cookie2 = new Cookie("bbb","BBB");
        response.addCookie(cookie2);
    %>
</body>
</html>
