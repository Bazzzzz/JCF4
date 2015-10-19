/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Pizza {
    private String deeg;
    private String kaas;
    private String saus;
    private int kookTijd;
    private ArrayList<String> groenten;
    
    public Pizza(int kookTijd) {
        this.deeg = null;
        this.kaas = null;
        this.saus = null;
        this.kookTijd = kookTijd;
        this.groenten = new ArrayList<String>();
    }

    public Pizza(String deeg, String kaas, String saus, int kookTijd) {
        this.deeg = deeg;
        this.kaas = kaas;
        this.saus = saus;
        this.kookTijd = kookTijd;
        this.groenten = new ArrayList<String>();
    }

    public Pizza(String deeg, String kaas, String saus, int kookTijd, String groenten) {
        this.deeg = deeg;
        this.kaas = kaas;
        this.saus = saus;
        this.kookTijd = kookTijd;
        this.groenten = new ArrayList<String>();
        this.groenten.add(groenten);
    }
    
    public int getKookTijd() {
        return kookTijd;
    }

    public String getDeeg() {
        return deeg;
    }

    public String getKaas() {
        return kaas;
    }

    public String getSaus() {
        return saus;
    }

    public ArrayList<String> getGroenten() {
        return groenten;
    }
    public void addGroenten(String groente) {
        this.groenten.add(groente);
    }
    
}
