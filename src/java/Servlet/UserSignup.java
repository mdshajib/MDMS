
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

/**
 *
 * @author DINA
 */
public class UserSignup extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserData anUserData=new UserData();
        anUserData.username=request.getParameter("textboxusername");
        anUserData.fullname=request.getParameter("textboxfullname");
        anUserData.email=request.getParameter("textboxemail");
        anUserData.phone=request.getParameter("textboxphone");
        anUserData.password=request.getParameter("textboxpassword");
        UserManager anUserManager =new UserManager();
        String signup;
        signup=anUserManager.Save(anUserData);
        request.setAttribute("signupmsg", signup);
        anUserData.Clear();
        RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
        rd.forward(request, response);   

        /*PrintWriter out = response.getWriter();
        out.println(request.getParameter("textboxusername"));*/
    }
}
