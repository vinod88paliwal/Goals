package com.oops.inheritance;

public class Sub extends Super {

	public Sub() {
		System.out.println("Sub Cons");
	}

	{
		System.out.println("Sub Instance Block");
	}
	
	static{
		System.out.println("Sub Static Block");
	}
	
	public static void main(String[] args) {
		
		Sub obj = new Sub();
	}
}
