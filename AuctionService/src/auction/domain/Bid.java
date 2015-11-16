/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction.domain;

/**
 *
 * @author sebas
 */
public class Bid {
    private User buyer;
    private int amount;

    public Bid(User buyer, int price) {
        this.buyer = buyer;
        this.amount = price;
    }    

    public User getBuyer() {
        return buyer;
    }

    public int getAmount() {
        return amount;
    }
    
}
