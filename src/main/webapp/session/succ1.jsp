<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/11
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>
    <%
        String username = (String) session.getAttribute("username");
        if (username == null) {//未登录，直接访问
            request.setAttribute("msg", "您还没有登录！");
            //转发到login.jsp
            request.getRequestDispatcher("/session/login.jsp").forward(request, response);
            return;
        }
    %>
    登录成功，欢迎你<%=username%>来访！
</body>
</html>
