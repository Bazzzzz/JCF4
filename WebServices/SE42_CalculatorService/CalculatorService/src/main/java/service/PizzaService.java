/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Pizza;
import java.util.ArrayList;
import javax.jws.WebService;

/**
 *
 * @author sebas
 */
@WebService
public class PizzaService {
    private Pizza pizza;

    public PizzaService(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public PizzaService(String deeg, String kaas, String saus, int kookTijd) {
        this.pizza = new Pizza(deeg, kaas, saus, kookTijd);
    }
    public String getKaas() {
        return this.pizza.getKaas();
    }
    public String getDeeg() {
        return this.pizza.getDeeg();
    }
    
    public String getSaus() {
        return this.pizza.getSaus();
    }
    public int getKookTijd() {
        return this.pizza.getKookTijd();
    }
    public ArrayList<String> getGroenten() {
        return this.pizza.getGroenten();
    }
    public void addGroenten(String groente) {
        this.pizza.addGroenten(groente);
    }
}
