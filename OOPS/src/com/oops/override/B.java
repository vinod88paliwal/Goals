package com.oops.override;

public class B extends A{

	public void show1(){  // Can increase the visibility in overridden method (in sub class) but can`t decrease it.
		System.out.println("show1 of B");
	}
	
	public static void show2(){
		System.out.println("static of B");
	}
	
	
public static void main(String[] args) {

System.out.println("--------------objA------------------");		
		A objA = new A();
		objA.show1();
		objA.show2();
		objA.show3();
		objA.show4();

System.out.println("--------------objB------------------");

		B objB = new B();
		objB.show1();
		objB.show2();
		objB.show3(); // Sub class Object calling super class method
		objB.show4(); // Sub class Object calling super class static method
		
System.out.println("-------------objAB-------------------");		
		A objAB = new B();
		objAB.show1();
		objAB.show2();
		objAB.show3(); // Sub class Object calling super class method
		objAB.show4(); // Sub class Object calling super class static method
	}
}
