<%-- 
    Document   : medicine
    Created on : Sep 15, 2017, 6:04:49 PM
    Author     : DINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="SearchMedicine" action="MedicineList" method="POST">
            <input type="text" name="medicinename" value="" />
            <input type="submit" value="Search" name="btnsearch" />
        </form>
        <%
        
        %>
    </body>
</html>
