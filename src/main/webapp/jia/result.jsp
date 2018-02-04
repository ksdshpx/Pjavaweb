<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/4
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<%
    Integer result = (Integer) request.getAttribute("result");
%>
结果:<%=result%>
</body>
</html>
