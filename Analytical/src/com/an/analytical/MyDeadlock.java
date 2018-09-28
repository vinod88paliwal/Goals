package com.an.analytical;

public class MyDeadlock {

    String str1 = " Java ";
    String str2 = " UNIX ";

    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
           // while(true){
                synchronized(str1){
                	System.out.println(Thread.currentThread().getName() + " synchronized(str1){");
                    synchronized(str2){
                        System.out.println(Thread.currentThread().getName() + (str1 + str2));
                    }
                }
            //}
        }
    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
         //   while(true){
                synchronized(str2){
                	System.out.println(Thread.currentThread().getName() + " synchronized(str2){");
                    synchronized(str1){
                    	System.out.println(Thread.currentThread().getName() + (str1 + str2));
                    }
                }
            //}
        }
    };

    public static void main(String a[]){

        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}