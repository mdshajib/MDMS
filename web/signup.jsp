<%-- 
    Document   : signup
    Created on : Sep 13, 2017, 12:32:49 PM
    Author     : DINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg=null;
msg = (String) request.getAttribute("signupmsg");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="signup" action="UserSignup" method="POST">
            <input type="text" name="textboxusername" value="" size="30" />
            <input type="text" name="textboxfullname" value="" size="30" />
            <input type="text" name="textboxemail" value="" size="30" />
            <input type="text" name="textboxphone" value="" size="30" />
            <input type="text" name="textboxpassword" value="" size="30" />
            <input type="submit" value="Submit" name="submit" />
        </form>
        <%
        if(msg !=null)
        out.println(msg);
        
        %>
    </body>
</html>
