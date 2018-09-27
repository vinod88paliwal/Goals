package com.thread.daemon;

public class DaemonThreadMain {
	 
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(), "dt");
       // dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(300);//main thread is in sleep mode.
        System.out.println("Finishing program");
    }
 
}
