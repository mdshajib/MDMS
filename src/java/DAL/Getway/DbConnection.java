
package DAL.Getway;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DINA
 */
public class DbConnection {
     public Connection Connection()
    {
        Connection con;
        try{
            String url,user,pass;
            url="jdbc:mysql://localhost:3306/mdms";
            user="root";
            pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            return con;
            }
        catch(Exception e)
        {e.printStackTrace();}
        return null;
    }
}
