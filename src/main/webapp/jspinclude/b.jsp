<h1>b.jsp</h1>
<%
    String username = (String)request.getParameter("username");
    String password = (String)request.getParameter("password");
    out.print(username+"---"+password);
%>
