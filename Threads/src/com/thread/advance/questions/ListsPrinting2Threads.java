package com.thread.advance.questions;

import java.util.Arrays;
import java.util.List;

public class ListsPrinting2Threads {

	boolean flag;

	List<String> l1 = Arrays.asList("a1", "a2", "a3", "a4", "a5", "a6", "a7");
	List<String> l2 = Arrays.asList("b1", "b2", "b3", "b4", "b5", "b6", "b7");

	int MAX = l1.size();

	public void printList1() {
		synchronized (this) {
			for (String s : l1) {

				if (flag) {
					try {
						wait(); // or this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("List1 : " + s);
				flag = true;
				notify();
			}
		}
	}

	public void printList2() {

		synchronized (this) {
			for (String s : l2) {

				if (!flag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("List2 : " + s);
				flag = false;
				notify();

			}
		}
	}

	public static void main(String[] args) {

		ListsPrinting2Threads obj = new ListsPrinting2Threads();

		Thread t1 = new Thread(() -> {
			obj.printList1();
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.printList2();
			}
		});

		t1.start();
		t2.start();
	}
}