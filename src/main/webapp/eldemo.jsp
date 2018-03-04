<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/4
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式入门</title>
</head>
<body>
    <%
        pageContext.setAttribute("xxx","pageContext.XXX");
        request.setAttribute("xxx","request_XXX");
        session.setAttribute("xxx","session_XXX");
        application.setAttribute("xxx","application_XXX");
    %>
    ${xxx}<br/>
    ${pageScope.xxx}<br/>
    ${requestScope.xxx}<br/>
    ${sessionScope.xxx}<br/>
    ${applicationScope.xxx}
</body>
</html>
