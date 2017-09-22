
package BLL;

import DAL.DAO.UserData;
import DAL.Getway.UserGetway;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DINA
 */
public class UserManager {
    UserGetway anUserGetway;
    public boolean FindUser(UserData anUserData)
    {
        anUserGetway = new UserGetway();
    return anUserGetway.HasUserWithPassword(anUserData.username, anUserData.password);
    }
    public String Save(UserData anUserData)
    {
        anUserGetway = new UserGetway();
        if(anUserGetway.HasUserWithPassword(anUserData.username, anUserData.password))
        return "Your System has already exist this username and password.";
        else
            return(anUserGetway.Save(anUserData));
    }

    public ArrayList<UserData> UserList()
    {
        anUserGetway = new UserGetway();
        return (ArrayList<UserData>) (anUserGetway.GetAllUsers());
    }
}
