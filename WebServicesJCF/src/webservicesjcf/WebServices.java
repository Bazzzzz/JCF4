/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesjcf;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 *
 * @author sebas
 */
@WebService
public class WebServices {
    
    public void WebServices(){}
    @WebMethod
    public int addNumbers(int x, int y) {
        return x+y;
    }
    @WebMethod
    public int subNumbers(int x, int y) {
        return x-y;
    }
    @WebMethod
    public int mulNumbers(int x, int y) {
        return x*y;
    }
    @WebMethod
    public int divNumbers(int x, int y) {
        return x/y;
    }
    
}
