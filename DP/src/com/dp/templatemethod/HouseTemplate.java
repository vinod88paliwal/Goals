package com.dp.templatemethod;

//Since we want some of the methods to be implemented by subclasses, we have to make our base class as abstract class.

public abstract class HouseTemplate {
	 
    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }
 
    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
 
    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();
 
    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}

//buildHouse() is the template method and defines the order of execution for performing several steps.