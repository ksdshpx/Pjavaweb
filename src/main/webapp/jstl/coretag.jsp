<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/7
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl中的c标签</title>
</head>
<body>
    <%--<%
        request.setAttribute("code","<script>alert('hello');</script>");
    %>--%>
    <%--${code}--%>
    <c:set var="code" value="<script>alert('hello');</script>"/>
    <c:remove var="code"/>
    <c:out value="${code}" escapeXml="false"/>
</body>
</html>
