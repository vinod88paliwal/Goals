package com.dp.factory;

//Super class in factory pattern can be an interface, abstract class or a normal java class. For our example, 
//we have super class as abstract class with overridden toString() method for testing purpose.
public abstract class Computer {
    
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}