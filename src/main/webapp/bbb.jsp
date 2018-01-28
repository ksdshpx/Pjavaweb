<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/1/28
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试获取request单数</title>
</head>
<body>
    <h1>测试获取request单数</h1>
    <a href="<%=request.getContextPath()%>/UServlet?xxx=XXX&yyy=YYY"/>获取get参数</a>
    <hr/>
    <form action="<%=request.getContextPath()%>/UServlet" method="post">
        用户名：<input type="text" name="username"/><br/>
        密  码：<input type="password" name="password"/><br/>
        爱  好：<input type="checkbox" name="hobby" value="eat"/>吃饭
                <input type="checkbox" name="hobby" value="sleep"/>睡觉
                <input type="checkbox" name="hobby" value="code"/>编码<br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
