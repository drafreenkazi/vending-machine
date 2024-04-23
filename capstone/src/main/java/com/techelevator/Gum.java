package com.techelevator;

public class Gum extends InventoryItem{
private String sound;
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public Gum(String name, double price, String sound, int itemQuantity){
        super(name, price, itemQuantity,sound);
        this.itemQuantity = itemQuantity;
        this.sound = "Chew Chew, Yum";
        //sound = new String("Chew Chew, Yum");
    }
}
