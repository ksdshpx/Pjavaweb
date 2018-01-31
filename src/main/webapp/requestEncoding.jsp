<%--
  Created by IntelliJ IDEA.
  User: peng.x
  Date: 2018/1/31
  Time: 22:46
  Function:演示请求编码
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>演示请求编码</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/ZServlet" method="post">
        用户名:<input type="text" name="username" value="李四"/><br/>
        <input type="submit" value="提交"/>
    </form>
    <hr/>
    <a href="<%=request.getContextPath()%>/ZServlet?username=张三">GET</a>
</body>
</html>
