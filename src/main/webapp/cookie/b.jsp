<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/5
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取Cookie</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            out.print(cookie.getName() + "=" + cookie.getValue() + "<br/>");
        }
    }
%>
</body>
</html>
