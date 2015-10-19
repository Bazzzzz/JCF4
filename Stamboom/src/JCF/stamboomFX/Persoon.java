/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.stamboomFX;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Persoon {
    private String naam;
    private String vnaam;
    private int leeftijd;
    private Persoon ouder1;
    private Persoon ouder2;
    private List<Persoon> kinderen;
    
    public Persoon(String naam, String vnaam, int leeftijd) {
        
        if (vnaam == null || naam == null || leeftijd < 0) {
            throw new IllegalArgumentException("Parameter vergeten.");
        }
        this.vnaam = vnaam;
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.ouder1 = null;
        this.ouder2 = null;
        this.kinderen = new ArrayList<Persoon>();
    }
    public void addOuder1(Persoon ouder1) {
        this.ouder1 = ouder1;
        ouder1.addKind(this);
    }
    public void addOuder2(Persoon ouder2) {
        this.ouder2 = ouder2;
        ouder2.addKind(this);
    }
    private void addKind(Persoon kind) {
        this.kinderen.add(kind);
    }
    public List<Persoon> getKinderen() {
        return this.kinderen;
    }
    public Persoon getOuder1() {
        return this.ouder1;
    }
    public Persoon getOuder2() {
        return this.ouder2;
    }
    public String getNaam() {
        return this.vnaam + " " + this.naam;
    }
}
