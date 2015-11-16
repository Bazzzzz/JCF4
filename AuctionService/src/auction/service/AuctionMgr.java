/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction.service;

import auction.doa.ItemDAO;
import auction.doa.UserDAO;
import auction.domain.Item;
import java.util.ArrayList;
import javax.jws.WebService;

/**
 *
 * @author sebas
 */
@WebService
public class AuctionMgr {

    private ArrayList<Item> auctionItems;
    private UserDAO userDAO;
    private ItemDAO itemDAO;
    
    public AuctionMgr() {
        this.auctionItems = new ArrayList<Item>();
    }
    
    
    public Item getItem(long id) {
        if(id > 0) {
            int intID = (int) id;
            return auctionItems.get(intID);
        } else {
            return null;
        }
    }

    public ArrayList<Item> getItems() {
        return auctionItems;
    }
    
}
