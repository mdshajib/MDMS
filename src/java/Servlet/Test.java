/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.DAO.UserData;
import DAL.Getway.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DINA
 */
public class Test extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    PrintWriter out = response.getWriter();
    String u,p,cmd,fn=null;
    u=request.getParameter("textboxusername");
    p=request.getParameter("textboxpassword");     
     /*  
    try
         {
             DbConnection dbcon=new DbConnection();
             Connection con=dbcon.Connection();
             cmd="SELECT * from test where name=? and password=?"; 
             PreparedStatement psmt;
             psmt=con.prepareStatement(cmd);
             psmt.setString(1,u);
             psmt.setString(2,p);
             ResultSet rs=psmt.executeQuery();
             while(rs.next())
             {
             fn=rs.getString("name");
             }
             
             out.println("fullname "+fn);
         }
         catch(Exception e)
         {e.printStackTrace();}
         */
     out.println("Tested.");
         
    }
}
