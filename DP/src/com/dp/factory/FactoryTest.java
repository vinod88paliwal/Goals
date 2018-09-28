package com.dp.factory;
 
//We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
//Notice that based on the input parameter, different subclass is created and returned.
public class FactoryTest {
 
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
 
}