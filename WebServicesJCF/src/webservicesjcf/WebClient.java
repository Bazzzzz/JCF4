/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesjcf;

import javax.xml.ws.WebServiceRef;
import webservicesjcf.WebServices;
/**
 *
 * @author sebas
 */
public class WebClient {
    @WebServiceRef(wsdlLocation="http://localhost:8080/WebServicesJCF/WebServices?wsdl")
    static WebServices service;
    
    public static void main (String[] args) {
        try {
            WebClient client = new WebClient();
            System.out.println("Add Numbers 5 and 3: " + client.addNumbers(5, 3));
            System.out.println("Subtract Numbers 5 and 3: " + client.subNumbers(5, 3));
            System.out.println("Multiply Numbers 5 and 3: " + client.mulNumbers(5, 3));
            System.out.println("Divide Numbers 5 and 3: " + client.divNumbers(5, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int addNumbers(int x, int y) {
        return service.addNumbers(x, y);
    }
    public int subNumbers(int x, int y) {
        return service.subNumbers(x, y);
    }
    public int mulNumbers(int x, int y) {
        return service.mulNumbers(x, y);
    }
    public int divNumbers(int x, int y) {
        return service.divNumbers(x, y);
    }
    
}
