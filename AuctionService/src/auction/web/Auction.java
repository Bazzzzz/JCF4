/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction.web;

import auction.domain.Bid;
import auction.domain.Category;
import auction.domain.Item;
import auction.domain.User;
import auction.service.AuctionMgr;
import auction.service.SellerMgr;
import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author sebas
 */
@WebService
public class Auction {

    private AuctionMgr auctionMgr = new AuctionMgr();
    private SellerMgr sellerMgr = new SellerMgr();

    public Auction() {
    }

    @WebMethod
    public Item getItem(long id) {
        Item item;
        if (auctionMgr.getItem(id) != null) {
            item = auctionMgr.getItem(id);
        } else if (sellerMgr.getItem(id) != null) {
            item = sellerMgr.getItem(id);
        } else {
            item = null;
        }
        return item;
    }

    @WebMethod
    public ArrayList<Item> findItemByDescription(String description) {
        ArrayList<Item> items = new ArrayList<>();
        for (Item item : auctionMgr.getItems()) {
            items = auctionMgr.getItems();
            if (item.getDescription().equals(description)) {
                items.add(item);
            }
        }
        for (Item item : sellerMgr.getItems()) {
            items = sellerMgr.getItems();
            if (item.getDescription().equals(description)) {
                items.add(item);
            }
        }
        return items;
    }

    @WebMethod
    public Bid newBid(Item item, User buyer, int amount) {
        Bid newBid = null;

        if (item != null && item.getHighest().getAmount() > amount) {
            newBid = new Bid(buyer, amount);
            item.setHighest(newBid);
        }
        return newBid;
    }

    @WebMethod
    public Item offerItem(User seller, Category cat, String description) {
        Item item = new Item(cat, description);
        item.setSeller(seller);

        return item;
    }

    @WebMethod
    public boolean revokeItem(Item item) {
        ArrayList<Item> itemsSeller = sellerMgr.getItems();
        ArrayList<Item> itemsAuction = auctionMgr.getItems();
        Iterator<Item> itrItemsSeller = itemsSeller.iterator();
        Iterator<Item> itrItemsAuction = itemsAuction.iterator();

        while (itrItemsSeller.hasNext() || itrItemsSeller.hasNext()) {
            if (itrItemsSeller.next().getItemID() == item.getItemID()) {
                itemsAuction.remove(item);
                return true;

            }
            if (itrItemsAuction.next().getItemID() == item.getItemID()) {
                itemsSeller.remove(item);
                return true;
            }
        }
        return false;
    }
}
