package com.thread.advance.questions;

class SynchronizationExample1 {
	private static SynchronizationExample1 synchronizationExample = new SynchronizationExample1();

	public static void main(String ar[]) {
		hello();
	}

	private static void hello() {
		
		synchronized (synchronizationExample) {
			
			System.out.println("Before making reference null");
			
			synchronizationExample = null;
			
			System.out.println("After making reference null");
		}
	}
}