package com.thread.stop;

public class Runner implements Runnable{
private volatile boolean exit = false;
    
    public void run() {
        while(!exit){
            System.out.println("Server is running.....");
        }
        
        System.out.println("Server is stopped....");
    }
    
    public void stop(){
        exit = true;
    }
}