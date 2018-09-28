package com.oops.finaltest;

public class FinalTest {

	//final FinalTest test = new FinalTest();
	
	final int i =10;
	
	
	public int getI() {
		return i;
	}


	void hello() {
		//test = new FinalTest(); // it cann`t be assigned again.
	}
	
	
	public static void main(String[] args) {

		System.out.println("aaa");
		FinalTest obj = new FinalTest();
		System.out.println(obj.i);
		//obj.i = 22;  // it cann`t be assigned again.

	}

}
