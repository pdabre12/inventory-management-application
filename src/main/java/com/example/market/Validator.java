package com.example.market;

import java.util.List;

public class Validator {
    public Validator(){}

    public static void validateCart(List<Item> items, List<Item> orderItems, List<CreditCard> cards, List<CreditCard> orderCards){
        Order o = new Order();
        int essentials = 0;
        int miscellaneous = 0;
        int luxury = 0;
        for(Item j:orderItems){
            for(Item i:items){
                if(j.getItem().equals(i.getItem())){
                    if(i.getQuantity()>=j.getQuantity()){
                        switch (j.getCategory()){
                            case "Essential":
                                if(essentials>5){
                                    break;
                                }
                                else if(essentials+j.getQuantity()>5){
                                    j.setQuantity(5-essentials);
                                    o.addChild(j);
                                    essentials=5;
                                    break;
                                }
                                else{
                                    o.addChild(j);
                                    essentials=essentials+j.getQuantity();
                                    break;

                                }
                            case "Luxury":
                                if(luxury>3){
                                    break;
                                }
                                else if(luxury+j.getQuantity()>3){
                                    j.setQuantity(3-luxury);
                                    o.addChild(j);
                                    luxury=3;
                                    break;
                                }
                                else{
                                    o.addChild(j);
                                    luxury=luxury+j.getQuantity();
                                    break;

                                }

                            case "Misc":
                                if(miscellaneous>6){
                                    break;
                                }
                                else if(miscellaneous+j.getQuantity()>6){
                                    j.setQuantity(6-miscellaneous);
                                    o.addChild(j);
                                    miscellaneous=6;
                                    break;
                                }
                                else{
                                    o.addChild(j);
                                    miscellaneous=miscellaneous+j.getQuantity();
                                    break;

                                }



                        }

                    }
                    else{
                        System.out.println("Please correct quantities:");
                        System.out.println("Incorrect quantity "+j.getQuantity()+j.getItem());
                        ErrorFile output = new ErrorFile();
                        output.write("Error.txt",j.getQuantity(),j.getItem());
                        System.exit(1);
                    }
                }
            }
        }
        o.checkout(items,cards,orderCards);





    }
}
