package com.dp.templatemethod;

//Template Method Concrete Classes
//We can have different type of houses, such as Wooden House and Glass House.

public class GlassHouse extends HouseTemplate {
	 
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }
 
    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
 
}