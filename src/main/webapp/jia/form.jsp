<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/4
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>两个整数相加</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/JiaServlet" method="post">
        整数1:<input type="text" name="num1"/><br/>
        整数2:<input type="text" name="num2"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
