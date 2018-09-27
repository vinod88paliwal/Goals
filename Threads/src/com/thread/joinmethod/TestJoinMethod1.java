package com.thread.joinmethod;

class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " -- " + i);
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			// System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		t1.setName("Thread t1");
		TestJoinMethod1 t2 = new TestJoinMethod1();
		t2.setName("Thread t2");
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t3.setName("Thread t3");
		t1.start();

		try {
			t1.join();//It guarantees that Control will not move to next (main thread will not run), until t1 completes it execution.
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();

	}
}