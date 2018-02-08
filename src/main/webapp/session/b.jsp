<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/8
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b.jsp</title>
</head>
<body>
    <h1>获取session中的值</h1>
    <%
        String s = (String) session.getAttribute("aaa");
    %>
    <%=s%>
</body>
</html>
