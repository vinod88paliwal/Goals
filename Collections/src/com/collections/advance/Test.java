package com.collections.advance;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {
public static void main(String[] args) {
	
	BlockingQueue<String> bq = new LinkedBlockingQueue<String>(4);

    try {
        bq.offer("A");
        bq.offer("B");
        bq.offer("C");
        bq.offer("D");
        bq.offer("E");

        System.out.println("1 = " + bq.take());
        System.out.println("2 = " + bq.take());
        System.out.println("3 = " + bq.take());
        System.out.println("4 = " + bq.take());
        System.out.println("5 = " + bq.take());
        System.out.println("6 = " + bq.take());
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
	
}
}
