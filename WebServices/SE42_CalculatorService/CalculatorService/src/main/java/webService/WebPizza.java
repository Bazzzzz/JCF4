/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import domain.Pizza;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import service.PizzaService;

/**
 *
 * @author sebas
 */
@WebService
public class WebPizza {
    private PizzaService pizzaService;
    private Pizza pizza;

    public WebPizza() {
        pizza = new Pizza("Deeg", "Kaas", "Saus", 15);
        pizza.addGroenten("Tomaat");
        pizza.addGroenten("Pepperoni");
        //this.pizzaService = new PizzaService(new Pizza(15));
        this.pizzaService = new PizzaService(pizza);
    }
    @WebMethod
    public void combineWebPizza(String deeg, String kaas, String saus, int kookTijd) {
        this.pizzaService = new PizzaService(deeg, kaas,saus, kookTijd);
    }
    @WebMethod
    public String getKaas() {
        return pizzaService.getKaas();
    }   
    @WebMethod
    public String getSaus() {
        return pizzaService.getSaus();

    }
    @WebMethod
    public String getDeeg() {
        return pizzaService.getDeeg();
    }
    @WebMethod
    public int getKookTijd() {
        return pizzaService.getKookTijd();
    }
    @WebMethod
    public ArrayList<String> getGroenten() {
        return pizzaService.getGroenten();
    }
    @WebMethod
    public void addGroenten(String groente) {
        pizzaService.addGroenten(groente);
    }
}
