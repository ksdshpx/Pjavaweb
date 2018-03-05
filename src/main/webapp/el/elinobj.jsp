<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/4
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>EL表达式11个内置对象</title>
</head>
<body>
    username:${param.username}<br/>
    hobby:${paramValues.hobby[0]} 和 ${paramValues.hobby[1]}<br/>
    header:${header['User-Agent']}<br/>
    context-param:${initParam['context-param']}<br/>
    jsessionid:${cookie.JSESSIONID.value}<br/>
    contextPath:${pageContext.request.contextPath}<br/>
    <hr/>
    <a href="${pageContext.request.contextPath}/el/eldemo.jsp">点击</a>
    <form action="${pageContext.request.contextPath}/el/eldemo.jsp">
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
