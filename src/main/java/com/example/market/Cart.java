package com.example.market;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public Cart(){}

    public double cart(ArrayList<Item> orderItems, List<Item> items, List<CreditCard> cards, List<CreditCard> orderCards) {
        double total = 0;
        List<String> finalCards = new ArrayList<>();


            for (CreditCard c :orderCards) {
                if (!cards.contains(c)) {
                    if(!finalCards.contains(c.getCardNumber())){
                        finalCards.add(c.getCardNumber());
                        cards.add(c);
                    }


                }


        }



        for(Item i:orderItems){
            int numberOfItems = i.getQuantity();

            double price = i.getPrice();
            total = total + numberOfItems*price;
            ItemManager.stockController(numberOfItems,i,items);
        }
        System.out.println(total);
        OutputCSVFile output = new OutputCSVFile();
        output.write("Output.csv",total);
        return total;



    }
}
