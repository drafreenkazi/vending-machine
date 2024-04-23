package com.techelevator;

public class Drinks extends InventoryItem{
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
    public Drinks(String name, double price, String sound, int itemQuantity){
        super(name, price, itemQuantity,sound);
        this.itemQuantity = itemQuantity;
        this.sound ="Glug Glug, Yum";
        //sound = new String("Glug Glug, Yum");
    }
}
