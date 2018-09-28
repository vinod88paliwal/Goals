package com.dp.templatemethod;

public class HousingClient {
	 
    public static void main(String[] args) {
         
        HouseTemplate houseType = new WoodenHouse();
         
        //using template method
        houseType.buildHouse();
        System.out.println("************");
         
        houseType = new GlassHouse();
         
        houseType.buildHouse();
    	
    	
    }
 
}

//Notice that client is invoking the template method of base class and depending of implementation of different steps,
//it’s using some of the methods from base class and some of them from subclass.