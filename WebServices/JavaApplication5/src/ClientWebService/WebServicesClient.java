/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientWebService;
import java.util.Scanner;
import webservice.*;
/**
 *
 * @author sebas
 */
public class WebServicesClient {
    public static void main (String [] args) /*throws NegativeNumberException_Exception*/ {
        /*WebCalculatorService service = new WebCalculatorService();
        WebCalculator delegate = service.getWebCalculatorPort();
        System.out.println("Optelling (1, 2): " + delegate.add(1,2));
        System.out.println("Aftrekking (2,1): " + delegate.minus(2,1));
        System.out.println("Vermenigvuldiging (1, 2): " + delegate.times(1,2));
        System.out.println("Deling (2,1): " + delegate.divide(2,1));*/
        WebPizzaService service = new WebPizzaService();
        WebPizza delegate = service.getWebPizzaPort();
        Scanner scan = new Scanner(System.in);
        System.out.println("Pizza 1 bestaat uit: " + getDeeg() +", "+ getKaas() + ", " + getSaus() + ". Kooktijd: " + getKookTijd());
        System.out.println("Pizza 1 heeft groenten: " + getGroenten().toString());
        System.out.println("Nieuwe Pizza combineren:");
        System.out.println("Deeg kiezen: ");
        String deeg = scan.nextLine();
        System.out.println("Kaas kiezen: ");
        String kaas = scan.nextLine();
        System.out.println("Saus kiezen: ");
        String saus = scan.nextLine();
        System.out.println("Kook tijd kiezen: ");
        int kookTijd = scan.nextInt();
        
        combineWebPizza(deeg, kaas, saus, kookTijd);
        System.out.println("Kies groenten (2): ");
        String groentes = scan.nextLine();
        String [] groenten= groentes.split(",");
        for (int i = 0; i < groenten.length; i++) {
            delegate.addGroenten(groenten[i]);
        }        
        System.out.println("Pizza 2 bestaat uit: " + getDeeg() +", "+ getKaas() + ", " + getSaus() + ". Kooktijd: " + getKookTijd());
        System.out.println("Pizza 2 heeft groenten: " + getGroenten().toString());
    }

    private static int getKookTijd() {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        return port.getKookTijd();
    }

    private static String getDeeg() {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        return port.getDeeg();
    }

    private static String getKaas() {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        return port.getKaas();
    }

    private static String getSaus() {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        return port.getSaus();
    }

    private static void addGroenten(java.lang.String arg0) {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        port.addGroenten(arg0);
    }

    private static java.util.List<java.lang.String> getGroenten() {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        return port.getGroenten();
    }

    private static void combineWebPizza(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        webservice.WebPizzaService service = new webservice.WebPizzaService();
        webservice.WebPizza port = service.getWebPizzaPort();
        port.combineWebPizza(arg0, arg1, arg2, arg3);
    }
    
    
    
    
    
}
