package com.oops.overload;

public class SubClass extends SuperClass{

public void hello(String s) {
		
		System.out.println("Sub");
	}
	
	
public static void main(String[] args) {
	
	SubClass obj = new SubClass();
	
	obj.hello("gg");
	obj.hello(5); //Sub class object is calling super class method, means its a overloading.
	
	SuperClass obj1 = new SubClass();
	obj1.hello(5); //Sub class object is calling super class method, means its a overloading.
	//obj1.hello("aa"); Because its overloading not overriding.
	
	
}	
}
