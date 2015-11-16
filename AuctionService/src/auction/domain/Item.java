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
public class Item {
    private Bid highest;
    private User seller;
    private Category category;
    private long itemID;
    private String description;

    public Item(Category category, String description) {
        this.category = category;
        this.description = description;
        this.highest = null;
        this.seller = null;
        this.itemID = 0;
    }
    public Item(Bid highest, User seller, Category category, long itemID, String description) {
        this.highest = highest;
        this.seller = seller;
        this.category = category;
        this.itemID = itemID;
        this.description = description;
    }

    public Bid getHighest() {
        return highest;
    }

    public User getSeller() {
        return seller;
    }

    public Category getCategory() {
        return category;
    }

    public long getItemID() {
        return itemID;
    }

    public String getDescription() {
        return description;
    }

    public void setHighest(Bid highest) {
        this.highest = highest;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
