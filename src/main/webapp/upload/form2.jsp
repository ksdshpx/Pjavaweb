<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2019/7/7
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>演示文件上传</title>
</head>
<body>
    <form action="<c:url value='/Upload2Servlet'/>" method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username"/><br/>
        照  片:<input type="file" name="picture"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
