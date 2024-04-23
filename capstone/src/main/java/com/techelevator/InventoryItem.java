package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class InventoryItem extends Inventory implements TransactionMessage{
    private String name;
    private double price;

    public String getSound() {
        return sound;
    }

//    public void setSound(String sound) {
//        this.sound = sound;
//    }

    private String sound;

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public InventoryItem(String name, double price,int itemQuantity, String itemSound){
        this.name = name;
        this.price = price;
        this.itemQuantity = itemQuantity;
        this.sound= itemSound;
    }
    public void subtractInventory() {
        this.itemQuantity = this.itemQuantity -1;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public final String getFoodSound(){
        String itemSound = sound;
        return itemSound;
    }

}

