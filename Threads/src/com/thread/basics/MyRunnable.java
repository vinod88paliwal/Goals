package com.thread.basics;

//implementing Thread by implementing Runnable interface

public class MyRunnable implements Runnable{        

    public void run(){
       System.out.println(" Create Thread " + Thread.currentThread().getName());
    }

 }
