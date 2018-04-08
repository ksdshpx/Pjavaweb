<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: south
  Date: 2018/3/7
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl中的c标签</title>
</head>
<body>
    <%--<%
        request.setAttribute("code","<script>alert('hello');</script>");
    %>--%>
    <%--${code}--%>
    <c:set var="code" value="<script>alert('hello');</script>"/>
    <c:remove var="code"/>
    <c:out value="${code}" escapeXml="false"/>
    <c:url value="/index.jsp"/><br/>
    <c:url value="/index.jsp">
        <c:param name="username" value="张三"/>
    </c:url>
    <hr/>
    <c:if test="${empty param.name}">
        您没有给出name参数！
    </c:if>
    <hr/>
    <c:choose>
        <c:when test="${empty param.name}">
            您没有给出name参数！
        </c:when>
        <c:otherwise>
            参数为:${param.name}
        </c:otherwise>
    </c:choose>

    <hr/>
    <c:forEach var="i" begin="1" end="10" step="2">
        ${i}
    </c:forEach>
    <hr/>
    <%
        String[] strs = {"one","two"};
        request.setAttribute("strs",strs);
    %>
    <c:forEach items="${strs}" var="str">
        ${str}
    </c:forEach>
    <hr/>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("一");
        list.add("二");
        list.add("三");
        pageContext.setAttribute("list",list);
    %>
    <c:forEach items="${list}" var="ele" varStatus="vs">
        第${vs.index}个元素是:${ele},是否为第一个元素：${vs.first},
        是否为最后一个元素：${vs.last},总共${vs.count}个元素。<br/>
    </c:forEach>
</body>
</html>
