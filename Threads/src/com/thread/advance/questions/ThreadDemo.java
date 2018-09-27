package com.thread.advance.questions;

public class ThreadDemo {
	
	public static void main(String ar[]) {
		System.out.println(hello());
	}

	private static int hello() {
		try {
			throw new RuntimeException("dwed");
		} finally {
			return 10;
		}
	}
}
/*
Output:
10

Why exception is not thrown?
When control entered hello() method, it encounters line in try block which throws RuntimeException,
 There is no handler for RuntimeException, so JVM will mark to throw exception up in call stack and go for execution of finally block.

Finally block overwrote the JVM marked return statement to throw RuntimeException and now return from finally block is result 10 
and not RuntimeException.

*/