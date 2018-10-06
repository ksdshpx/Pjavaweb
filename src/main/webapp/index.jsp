<%--
  Created by IntelliJ IDEA.
  User: ksdshpx
  Date: 2018/1/9
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<meta http-equiv="refresh" content="3;url=http://www.itcast.cn">--%>
</head>
<body>
    跳转
   <%-- <%
        int i = 10/0;
    %>--%>
    <
    <form action="/Pjavaweb/CServlet" method="post">
        <input type="submit" value="提交"/>
    </form>

    <%
        application.setAttribute("xxx","XXX");
        application.removeAttribute("xxx");
    %>
</body>
</html>
