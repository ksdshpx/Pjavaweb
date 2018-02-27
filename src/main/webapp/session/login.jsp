<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/2/11
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页面</title>
    <<%--cript src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>--%>
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
        验证码:<input type="text" name="vcode" size="3"/><img id="img" src="<%=request.getContextPath()%>/VerifyCodeServlet"/><a href="#" onclick="_changeVerifyCode();">看不清,换一张</a><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
<script type="text/javascript">
    function _changeVerifyCode(){
        document.getElementById("img").src = "<%=request.getContextPath()%>/VerifyCodeServlet?t="+new Date().getTime();
    }
</script>
</html>
