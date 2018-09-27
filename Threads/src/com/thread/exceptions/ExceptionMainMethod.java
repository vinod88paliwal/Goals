package com.thread.exceptions;

public class ExceptionMainMethod {
	
	public static void main(String ar[]) {
		System.out.println(hello());
	}

	private static int hello() {
		try {
	     System.out.println("Start");		
			System.exit(0);
								//System.out.println("fff");
			throw new RuntimeException("abcd");
			//System.exit(0); // Unreachable code
		} finally {
			return 10;
		}
	}
}