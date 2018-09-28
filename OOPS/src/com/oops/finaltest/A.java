package com.oops.finaltest;

public class A {

	final static void show(){
		System.out.println("final static");
	}
	
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
	}
}
