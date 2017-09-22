<%-- 
    Document   : Login
    Created on : Sep 13, 2017, 10:10:58 AM
    Author     : DINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg= null;
msg = (String) request.getAttribute("wronguser");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="login" action="UserLogin" method="POST">
            <input type="text" name="textboxusername" value="" size="30" />
            <input type="password" name="textboxpassword" value="" size="30" />
           <input type="submit" value="ok">
        </form>
        <%
            if(msg !=null)
            out.println(msg);
        %>
    </body>
</html>
