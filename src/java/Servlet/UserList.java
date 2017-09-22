
package Servlet;

import BLL.UserManager;
import DAL.DAO.UserData;
import DAL.Getway.UserGetway;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DINA
 */
public class UserList extends HttpServlet {
    UserManager anUserManager;
    RequestDispatcher rd;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        anUserManager = new UserManager();
        ArrayList <UserData> list=anUserManager.UserList();
        request.setAttribute("listData", list);
        rd=request.getRequestDispatcher("userlist.jsp");
        rd.forward(request, response);
    }
}
