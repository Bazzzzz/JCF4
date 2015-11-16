/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction.web;

import auction.domain.User;
import auction.service.RegistrationMgr;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author sebas
 */
@WebService
public class Registration {
    private RegistrationMgr registrationMgr = new RegistrationMgr();
    
    public Registration() {}
    @WebMethod
    public User registerUser(String name, String email) {
        if(email != null) {
            return registrationMgr.register(name, email);
        }
        return null;
    }
    @WebMethod
    public User getUser(String email) {
        if(email != null) {
            return registrationMgr.getUser(email);
        }
        return null;
    }
}
