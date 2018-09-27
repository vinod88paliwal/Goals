package sujit;

import java.util.ArrayList;

public class ThreadExample1 {

	public int currTaskVal = 1;
	public int greatChar = 65;
	public int smallChar = 97;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadExample1 ex = new ThreadExample1();
		ArrayList<Thread> al = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			Thread t = new Thread(new MyThread("Thread-" + i, i, ex));
			al.add(t);
		}

		for (Thread tt : al) {
			tt.start();
			// tt.join();
		}
		/*
		 * int c = 65 + 32; System.out.println((char) (c + 1));
		 */
	}

}
