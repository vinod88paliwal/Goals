package com.thread.basics;

class MyRunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public MyRunnableThread(){
         
    }
    public void run() {
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}