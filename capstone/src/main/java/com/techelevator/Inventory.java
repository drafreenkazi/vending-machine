package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory{
    private final Scanner userInput = new Scanner(System.in);
    private Map<String, InventoryItem> inventoryMap = new TreeMap<>();


    public Map<String, InventoryItem> getInventoryMap() {
        return inventoryMap;
    }
    public InventoryItem returnSelectedItemInventoryMap(String selectedItem) {
        return inventoryMap.get(selectedItem);
    }
    public void loadInventory() {
        File readFile = new File("vendingmachine.csv");
        try (Scanner inputScanner = new Scanner(readFile)) {
            while (inputScanner.hasNextLine()) {
                String line = inputScanner.nextLine();
                String[] lineData = line.split("\\|");
                String itemType = lineData[3];
                //item Quantity to br stocked to maximum of 5 while loading
                if(itemType.equals("Chip")){
                    Chips chip = new Chips(lineData[1],Double.parseDouble(lineData[2]), "Crunch Crunch, Yum!",5);
                    inventoryMap.put(lineData[0], chip);
                }else if(itemType.equals("Candy")){
                    Candy candy = new Candy(lineData[1], Double.parseDouble(lineData[2]),"Munch Munch, Yum!", 5);
                    inventoryMap.put(lineData[0], candy);
                }else if(itemType.equals("Drink")){
                    Drinks drink = new Drinks(lineData[1], Double.parseDouble(lineData[2]),"Glug Glug, Yum!",5);
                    inventoryMap.put(lineData[0], drink);
                }else if (itemType.equals("Gum")){
                    Gum gum = new Gum(lineData[1], Double.parseDouble(lineData[2]),"Chew Chew, Yum! Test", 5);
                    inventoryMap.put(lineData[0], gum);
                }
                if (readFile.exists()) {

                } else if (!readFile.isFile()) {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
