<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/11
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <style type="text/css">
       #msgDiv{
           color: red;
       }
    </style>
</head>
<body>
    <%
        //获取错误信息
        String msg = (String) request.getAttribute("msg");
        msg = (msg == null) ? "" : msg;
        String uname = "";
        //获取Cookie中的用户名
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                if("uname".equals(cookie.getName())){
                    uname = cookie.getValue();
                }
            }
        }
    %>
    <div id="msgDiv"><%=msg%></div>
    <form action="<%=request.getContextPath()%>/LoginServlet" method="post">
        用户名:<input type="text" name="username" value="<%=uname%>"/><br/>
        密 码:<input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
