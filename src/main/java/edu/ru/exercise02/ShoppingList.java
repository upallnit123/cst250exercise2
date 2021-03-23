/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.exercise02;

import java.util.ArrayList;

/**
 *
 * @author upall
 */
public class ShoppingList {
    
    private ArrayList<ShoppingItems> items;

    public ShoppingList(ArrayList<ShoppingItems> items) {
        this.items = items;
    }
    
    public ShoppingList(){
        this.items = new ArrayList<>();
    }
    
      public ArrayList<ShoppingItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingItems> items) {
        this.items = items;
    }
    //Method below adds items to the shopping list.
    public void addItemToList(String itemName){
        ShoppingItems newItem = new ShoppingItems(itemName);
        this.items.add(newItem);
    }
    
    public void display(){
        System.out.println("----------------");
        System.out.println("Items: ");
        System.out.println("----------------");
        for(ShoppingItems item : this.items){
            item.display();
        }
        System.out.println("----------------");
        
    }
    
    
}
