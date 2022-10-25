package com.example.market;

import java.util.List;

public class ItemManager {
    public ItemManager(){};

    public void manageItem(List<Item> items, List<Item> orderItems, List<CreditCard> orderCards){

        for(Item j: orderItems){
            for (Item i: items){

                if (j.getItem().equals(i.getItem())) {

                    j.setCategory(i.getCategory());
                    j.setPrice(i.getPrice());
                }
            }
        }

    }


    public static void stockController(int quantity, Item i, List<Item> items) {
        for (Item j : items) {
            if(i.getItem().equals(j.getItem())){
                int currentQuantity = j.getQuantity();
                int final_quantity = currentQuantity - quantity;

            j.setQuantity(final_quantity);

        }}

    }
}
