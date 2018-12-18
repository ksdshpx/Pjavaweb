<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/12/17
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>图书列表</title>
    <meta charset="UTF-8"/>
</head>
<body>
    <h1 align="center">图书列表</h1>
    <table border="1" cellspacing="0" width="50%" align="center">
        <tr>
            <th>书名</th>
            <th>单价</th>
            <th>分列</th>
        </tr>
        <c:forEach items="${beanList}" var="book">
            <tr>
                <td>${book.bname}</td>
                <td>${book.price}</td>
                <td>
                    <c:choose>
                        <c:when test="${book.category eq 1}"><p style="color: red">JavaSE</p></c:when>
                        <c:when test="${book.category eq 2}"><p style="color: blue">JavaEE</p></c:when>
                        <c:when test="${book.category eq 3}"><p style="color: green">JavaFrameWork</p></c:when>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
