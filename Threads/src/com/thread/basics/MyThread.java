package com.thread.basics;

//implementing Thread by extending Thread class
public class MyThread extends Thread{      

  public void run(){
     System.out.println(" Thread Running " + Thread.currentThread().getName());
  }
}