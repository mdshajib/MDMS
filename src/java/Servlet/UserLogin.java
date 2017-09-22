
package Servlet;

import BLL.UserManager;
import DAL.DAO.UserData;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author DINA
 */
public class UserLogin extends HttpServlet {
    UserManager anUserManager;
    RequestDispatcher rd;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String msg;
        UserData anUserData=new UserData();
        anUserData.username=request.getParameter("textboxusername");
        anUserData.password=request.getParameter("textboxpassword");
        anUserManager = new UserManager();
        if(anUserManager.FindUser(anUserData))
        {
            HttpSession session= request.getSession();
            session.setAttribute("username",anUserData.username);
            rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        else
        {
            msg="Wrong Username or Password. Please Try again later.";
            request.setAttribute("wronguser", msg);
            rd=request.getRequestDispatcher("Login.jsp");
            rd.forward(request, response);   
        }
    }

}
