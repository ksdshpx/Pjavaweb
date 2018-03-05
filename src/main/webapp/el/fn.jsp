<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/5
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>EL函数库</title>
</head>
<body>
    <h1>使用EL函数库</h1>
    ${fn:endsWith("Hello.java", ".java")}<br/>
    ${fn:substring("HelloWorld", 0 , 5 )}
</body>
</html>
