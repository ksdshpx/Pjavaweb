<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/11/1
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分IP统计访问次数</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>ip地址</td>
        <td>访问次数</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${applicationScope.map}" var="entry">
        <tr>
            <td>${entry.key}</td>
            <td>${entry.value}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
