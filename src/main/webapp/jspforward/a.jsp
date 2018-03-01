<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/1
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp动作标签</title>
</head>
<body>
    <h1>a.jsp</h1>
    <jsp:forward page="b.jsp">
        <jsp:param name="username" value="zhangsan"/>
        <jsp:param name="password" value="123"/>
    </jsp:forward>
</body>
</html>
