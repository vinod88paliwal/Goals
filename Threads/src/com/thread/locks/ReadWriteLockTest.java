package com.thread.locks;

public class ReadWriteLockTest {
	private static final int READER_SIZE = 10;
	private static final int WRITER_SIZE =2;
	
	
	public static void main(String[] args) {
		
		Integer[] initialElements = {33,28,86,99};

		ReadWriteList<Integer> sharedList = new ReadWriteList<>(initialElements);
		

		for (int i = 0; i < WRITER_SIZE; i++) {
			new Writer(sharedList).start();
		}
		
		for (int i = 0; i < READER_SIZE; i++) {
			new Reader(sharedList).start();
		}
		
		
	}

}
