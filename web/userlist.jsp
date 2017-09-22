<%-- 
    Document   : userlist
    Created on : Sep 22, 2017, 10:49:31 AM
    Author     : DINA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAL.DAO.UserData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
ArrayList <UserData> alist=(ArrayList<UserData>) request.getAttribute("listData");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User List!</h1>
        <form action="UserList" method="POST" enctype="multipart/form-data">
            <input type="submit" value="User" name="btnuserlist" />
        </form>
        <%
        try
        {
        if(alist !=null)
        {
            for(int i=0;i<alist.size();i++)
            {
                out.println();
                out.println("Username: "+alist.get(i).username+ ", Fullname : "+alist.get(i).fullname+", Email: "+alist.get(i).email+", Phone : "+alist.get(i).phone);
                
            }
        }
        }
        catch(Exception ex)
                {out.print(ex);}
        %>
    </body>
</html>
