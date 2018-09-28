package com.collectios.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListSortingExample {

private static class SmartPhone implements Comparable<SmartPhone> {
	    private String brand;
	    private String model;
	    private int price;

	    public SmartPhone(String brand, String model, int price){
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }
	  
	    @Override
	    public int compareTo(SmartPhone sp) {
	        return this.brand.compareTo(sp.brand);
	        //or
	        //return (this.price > sp.price) ? 1:0;
	    }

	    @Override
	    public String toString() {
	        return "SmartPhone{" + "brand=" + brand + ", model=" + model + ", price=" + price + '}';
	    }
	  
	}//end of SmartPhone class

 private static class PriceComparator implements Comparator<SmartPhone>{

        @Override
        public int compare(SmartPhone sp1, SmartPhone sp2) {
            return (sp1.price < sp2.price ) ? -1: (sp1.price > sp2.price) ? 1:0 ;
        }      
    }//end of PriceComparator class

    public static void main(String... args) {
      
        //creating objects for arraylist sorting example
        SmartPhone apple = new SmartPhone("Apple", "IPhone4S",1000);
        SmartPhone nokia = new SmartPhone("Nokia", "Lumia-800",600);
        SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Ace",800);
        SmartPhone lg = new SmartPhone("LG", "Optimus",500);
      
        //creating Arraylist for sorting example
        ArrayList smartPhones = new ArrayList();
      
        //storing objects into ArrayList for sorting
        smartPhones.add(apple);
        smartPhones.add(nokia);
        smartPhones.add(samsung);
        smartPhones.add(lg);
      
        //Sorting Arraylist in Java on natural order of object
        Collections.sort(smartPhones);
      
        //print sorted arraylist on natural order
        System.out.println("sorted nuturally : "+smartPhones);
      
        //Sorting Arraylist in Java on custom order defined by Comparator
        Collections.sort(smartPhones,new PriceComparator());
      
        //print sorted arraylist on custom order
      System.out.println("Custom sorted based on prize : "+smartPhones);
    
    }
}
