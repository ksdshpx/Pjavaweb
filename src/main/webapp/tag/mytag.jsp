<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/4/13
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="sfit" uri="/WEB-INF/tlds/sfit.tld" %>
<html>
<head>
    <title>自定义标签</title>
</head>
<body>
    <sfit:myTag5 test="${empty param.name}">
        <sfit:myTag4/>
    </sfit:myTag5>
    <sfit:myTag1/>
    <sfit:myTag2/>
    <hr/>
    <%
        request.setAttribute("name","zhangSan");
    %>
    <sfit:myTag3>
        ${name}
    </sfit:myTag3>
</body>
</html>
