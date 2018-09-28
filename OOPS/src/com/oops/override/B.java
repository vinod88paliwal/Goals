package com.oops.override;

public class B extends A{

	public void show1(){
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

System.out.println("--------------objB------------------");

		B objB = new B();
		objB.show1();
		objB.show2();

System.out.println("-------------objAB-------------------");		
		A objAB = new B();
		objAB.show1();
		objAB.show2();
		
	}
}
