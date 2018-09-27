package com.thread.basics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadStop extends Thread{
		    boolean bExit = false;
		  
		    public void exit(boolean bExit){
		        this.bExit = bExit;
		    }
		  
		    @Override
		    public void run(){
		        while(!bExit){
		            System.out.println("Thread is running");
		                try {
		                    Thread.sleep(500);
		                } catch (InterruptedException ex) {
		                    Logger.getLogger(ThreadStop.class.getName()).log(Level.SEVERE, null, ex);
		                }
		        }
		    }
		}