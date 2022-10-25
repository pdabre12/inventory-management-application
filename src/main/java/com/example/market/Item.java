//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.market;



public class Item {
    private String category;
    private String item;
    private int quantity;
    private double price;

    public Item(String category,String item,int quantity ,double price) {
        this.category = category;
        this.item = item;
        this.quantity=quantity;
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public Item(String item,int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }




    public String toString() {
        return "Item [Category=" + this.category + ", item=" + this.item + ", quantity=" + this.quantity + ",price="+this.price+"]";
    }
}
