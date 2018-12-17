<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/12/17
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>链接页面</title>
</head>
<body>
    <h1>链接页面</h1>
    <a href="<c:url value='/BookServlet?method=findAll'/>">查看所有</a>
    <a href="<c:url value='/BookServlet?method=findByCategory&category=1'/>">查看SE</a>
    <a href="<c:url value='/BookServlet?method=findByCategory&category=2'/>">查看EE</a>
    <a href="<c:url value='/BookServlet?method=findByCategory&category=3'/>">查看FrameWork</a>
</body>
</html>
