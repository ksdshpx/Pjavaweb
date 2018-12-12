<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/12/12
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全站编码演示</title>
</head>
<body>
    <a href="<c:url value='/FullEncodeServlet?username=张三'/>">点击这里</a>
    <form action="<c:url value='/FullEncodeServlet'/>" method="post">
        用户名：<input type="text" name="username"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
