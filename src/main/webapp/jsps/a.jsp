<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/3
  Time: 22:35
  Function:测试jsp中的三种java片段
            1、<%...%>:方法中能写什么，这里就可以写什么
            2、<%=...%>:response.getWriter().println(..)中能放什么，这里就可以放什么
            3、<%!...%>:类中可以写什么，这里就可以写什么
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试jsp中的三种java片段</title>
</head>
<body>
    <%
        int a = 10;
    %>
    <%
        out.println(a);
    %>
    <%=a%>
    <%! private int a = 100;%>
    <%
        out.println(a++);//10
    %>
    <%
        out.print(this.a++);//100
    %>
</body>
</html>
