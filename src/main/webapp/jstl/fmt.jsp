<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>fmt格式化标签</title>
</head>
<body>
    <%
        request.setAttribute("date",new Date());
    %>
    <fmt:formatDate value="${requestScope.date}" pattern="yyyy-MM-dd HH:mm:ss SSS"/>

    <%
        request.setAttribute("num",3.1415926);
    %>
    <fmt:formatNumber value="${num}" pattern="0.000"/>
    <fmt:formatNumber value="${num}" pattern="#.###"/>
</body>
</html>
