package com.example.market;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public Order(){}
    protected ArrayList<Item> orderItems= new ArrayList<Item>() ;

    public void addChild(Item i){
        orderItems.add(i);

    }
    public void removeChild(Order o){
        orderItems.remove(o);

    }
    public Item getChild(int i){
        return orderItems.get(i);

    }

    public void printDescription(){
        for (Item i: orderItems){
            System.out.println(i);
        }
    }

    public void checkout(List<Item> items, List<CreditCard> cards, List<CreditCard> orderCards){
        Cart c= new Cart();
        c.cart(orderItems,items,cards,orderCards);
    }

}
