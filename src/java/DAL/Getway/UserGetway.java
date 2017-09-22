
package DAL.Getway;

import DAL.DAO.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DINA
 */
public class UserGetway {
    DbConnection dbcon;
    ResultSet rs;
    public String fullnames;
    UserData anUserData;
    Connection con;
    String cmd=null;
    public boolean HasUserWithPassword(String username, String password)
    {
        return FindUserWithPassword(username,password)!=null;
    }
    private UserData FindUserWithPassword(String username, String password)
    {
        anUserData = new UserData();
        //sql here
        dbcon = new DbConnection();
        con=dbcon.Connection();
        cmd="Select username,fullname from tbl_user where username=? and password=?";
        try    
        {
            PreparedStatement psmt;
            psmt = con.prepareStatement(cmd);
            psmt.setString(1, username);
            psmt.setString(2, password);
            rs=psmt.executeQuery();
            while (rs.next()) {
                anUserData.username=rs.getString("username");
                anUserData.fullname=rs.getString("fullname");
                return anUserData;
            }
            //con.close();
        }
        catch(Exception e)
        {}
    return null;
    }
    public List<UserData> GetAllUsers()
    {
        ArrayList <UserData> userList = new ArrayList<>();
        cmd="Select username,fullname,email,phone from tbl_user order by username asc";
        dbcon = new DbConnection();
        con=dbcon.Connection();
        Statement smt;
        try{
            smt=con.createStatement();
            rs=smt.executeQuery(cmd);
            while(rs.next())
            {
                anUserData = new UserData();
                anUserData.username=rs.getString("username");
                anUserData.fullname=rs.getString("fullname");
                anUserData.email=rs.getString("email");
                anUserData.phone=rs.getString("phone");
                userList.add(anUserData);
            }
        }
        
        catch(SQLException ex)
        {}
        
    return userList;
    }
    public String Save(UserData anUserData)
    {
        cmd="Insert into tbl_user(username,fullname,email,phone,password) values('"+anUserData.username+"','"+anUserData.fullname+"','"+anUserData.email+"','"+anUserData.phone+"','"+anUserData.password+"')";
        dbcon = new DbConnection();
        con=dbcon.Connection();
        try {
            Statement smt;
            smt = con.createStatement();
            smt.executeUpdate(cmd);
            smt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Information successfully stored in this system.";
    }
}
