<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/11/2
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>user.jsp</title>
</head>
<body>
    <h1>您是会员</h1>
    <a href="<c:url value='../all.jsp'/>">游客入口</a>
    <a href="<c:url value='user.jsp'/>">会员入口</a>
    <a href="<c:url value='../admin/admin.jsp'/>">管理员入口</a>
</body>
</html>
