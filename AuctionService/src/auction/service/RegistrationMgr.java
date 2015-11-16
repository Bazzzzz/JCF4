/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction.service;

import auction.doa.UserDAO;
import auction.domain.User;
import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebService;

/**
 *
 * @author sebas
 */
@WebService
public class RegistrationMgr {

    private ArrayList<User> userList;
    private UserDAO userDAO;
    public RegistrationMgr() {
        userList = new ArrayList<User>();
    }
    /**
     * Register a user to the list.
     * @param name
     * @param email
     * @return Registered user.
     */
    public User register(String name, String email) {
        if (email != null && name != null) {
            Iterator<User> userItr = userList.iterator();
            if (userList.size() > 0) {
                while (userItr.hasNext()) {
                    User tempUser = (User) userItr;
                    if (!tempUser.getName().equals(name) && !tempUser.getEmail().equals(email)) {
                        User user = new User(name, email);
                        userList.add(user);
                        return user;
                    }
                }
            } else {
                User user = new User(name, email);
                userList.add(user);
                return user;
            }
        }
        return null;
    }
    /**
     * Retrieve a user from the list.
     * @param email
     * @return User.
     */
    public User getUser(String email) {
        if (email != null) {
            Iterator<User> userItr = userList.iterator();
            while(userItr.hasNext()) {
                User tempUser = (User)userItr;
                if(tempUser.getEmail().equals(email)) {
                    return tempUser;
                }
            }
        }
        return null;
    }

}
