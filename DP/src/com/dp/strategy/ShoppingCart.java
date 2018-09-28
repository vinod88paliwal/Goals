package com.dp.strategy;

import java.util.*;

public class ShoppingCart {
	 
    //List of items
    private List<Item> items;
     
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
     
    public void addItem(Item item){
        this.items.add(item);
    }
     
    public void removeItem(Item item){
        this.items.remove(item);
    }
     
    private int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
     
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}