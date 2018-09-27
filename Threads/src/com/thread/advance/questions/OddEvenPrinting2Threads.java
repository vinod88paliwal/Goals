package com.thread.advance.questions;

public class OddEvenPrinting2Threads {

	boolean flag;
	int count = 1;
	int MAX = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {

				if (flag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd : " + count);
				count++;
				flag = true;
				notify();
			}
		}
	}

	public void printEven() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < MAX) {

				if (!flag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even : " + count);
				count++;
				flag = false;
				notify();

			}
		}
	}

	public static void main(String[] args) {

		OddEvenPrinting2Threads oep = new OddEvenPrinting2Threads();
		
		Thread t1 = new Thread(()-> { oep.printEven();  });
		
		Thread t2 = new Thread(() -> { oep.printOdd(); });
				
		t1.start();
		t2.start();

		/*try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

	}
}