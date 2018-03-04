<%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/4
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="cn.ksdshpx.domain.Address" %>
<%@ page import="cn.ksdshpx.domain.Employee" %>
<html>
<head>
    <title>EL表达式测试</title>
</head>
<body>
    <%
        Address address = new Address();
        address.setCity("上海");
        address.setStreet("唐镇");
        Employee employee = new Employee();
        employee.setName("张三");
        employee.setSaraly(6600);
        employee.setAddress(address);
        request.setAttribute("employee",employee);
    %>
    ${requestScope.employee.address.street}
</body>
</html>
