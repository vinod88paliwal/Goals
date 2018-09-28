package com.thread.advance.questions;

public class ThreadsPrintingABCInSequence {
	 int flag = 1;
	 public static void main(String[] args) {
		 
		 ThreadsPrintingABCInSequence obj = new ThreadsPrintingABCInSequence();
	 
		 Thread t1 = new Thread(()-> { obj.printA();  });
		 Thread t2 = new Thread(()-> { obj.printB();  });
		 Thread t3 = new Thread(()-> { obj.printC();  });
					
			t1.start();
			t2.start();
			t3.start();
	    }
	 
	 public void printA() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=1){
		                    wait();
		                }

		                System.out.print("A ");
		                Thread.sleep(100);
		                flag = 2;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}
	 
	 public void printB() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=2){
		                    wait();
		                }

		                System.out.print("B ");
		                Thread.sleep(100);
		                flag = 3;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}
	 
	 public void printC() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=3){
		                    wait();
		                }

		                System.out.print("C ");
		                Thread.sleep(100);
		                flag = 1;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}

}


//Old Style

/*
 public class ThreadsPrintingABCInSequence {
	 int flag = 1;
	 public static void main(String[] args) {
		 
		 ThreadsPrintingABCInSequence lock = new ThreadsPrintingABCInSequence();
	 
	      ThreadA a=new ThreadA(lock);
	        ThreadB b=new ThreadB(lock);
	        ThreadC c=new ThreadC(lock);
	 
	        a.start();
	        b.start();
	        c.start();
	    }
	 
	 public void printA() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=1){
		                    wait();
		                }

		                System.out.print("A ");
		                Thread.sleep(100);
		                flag = 2;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}
	 
	 public void printB() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=2){
		                    wait();
		                }

		                System.out.print("B ");
		                Thread.sleep(100);
		                flag = 3;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}
	 
	 public void printC() {
			try{
		        synchronized (this) {

		            for (int i = 0; i < 5; i++) {

		                while(flag!=3){
		                    wait();
		                }

		                System.out.print("C ");
		                Thread.sleep(100);
		                flag = 1;
		                notifyAll();
		            }

		        }
		    }catch (Exception e) {
		        System.out.println("Exception 1 :"+e.getMessage());
		    }
		}

}


 
class ThreadA extends Thread{
	 
    ThreadsPrintingABCInSequence lock;
 
    ThreadA(ThreadsPrintingABCInSequence lock){
        this.lock = lock;
    }
    
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 5; i++) {
 
                    while(lock.flag!=1){
                        lock.wait();
                    }
 
                    System.out.print("A ");
                    Thread.sleep(100);
                    lock.flag = 2;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 1 :"+e.getMessage());
        }
 
    }
 
}

class ThreadB extends Thread{
	 
    ThreadsPrintingABCInSequence lock;
 
    ThreadB(ThreadsPrintingABCInSequence lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 5; i++) {
 
                    while(lock.flag!=2){
                        lock.wait();
                    }
 
                    System.out.print("B ");
                    Thread.sleep(100);
                    lock.flag = 3;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 2 :"+e.getMessage());
        }
 
    }
}

class ThreadC extends Thread{
	 
    ThreadsPrintingABCInSequence lock;
 
    ThreadC(ThreadsPrintingABCInSequence lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 5; i++) {
 
                    while(lock.flag!=3){
                        lock.wait();
                    }
 
                    System.out.print("C ");
                    Thread.sleep(100);
                    lock.flag = 1;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 3 :"+e.getMessage());
        }
 
    }
}
*/