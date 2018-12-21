<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="<c:url value='/Upload1Servlet'/>" method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username"/><br/>
        照  片:<input type="file" name="picture"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
