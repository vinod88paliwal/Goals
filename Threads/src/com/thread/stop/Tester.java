package com.thread.stop;

import java.util.concurrent.TimeUnit;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
	Runner myServer=	new Runner();
		
     Thread t1 = new Thread(myServer, "T1");
     t1.start();
     
     //Now, let's stop our Server thread
     System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
     myServer.stop();
     
     //Let's wait to see server thread stopped 
     TimeUnit.MILLISECONDS.sleep(200);
     
     System.out.println(Thread.currentThread().getName() + " is finished now");

	}
}
