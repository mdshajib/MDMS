<%-- 
    Document   : index
    Created on : Sep 13, 2017, 9:03:16 AM
    Author     : DINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String user=null;
if(session.getAttribute("username")==null)
response.sendRedirect("Login.jsp");
else
user= (String) session.getAttribute("username");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="login" action="UserLogin" method="POST">
            <input type="submit" value="ok">
        </form>
        <%
        out.println(user);
        
        %>
        <form action="<%=response.encodeURL("Test2") %>" method="post"></form>

         
    </body>
</html>
