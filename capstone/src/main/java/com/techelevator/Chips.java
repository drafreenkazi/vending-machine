package com.techelevator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Chips extends InventoryItem{
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound;

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public Chips(String name , double price, String sound, int itemQuantity){
        super(name, price,itemQuantity,sound);
        this.itemQuantity = itemQuantity;
        this.sound ="Crunch Crunch, Yum!";
        //sound = new String("
        // m");
    }


}
