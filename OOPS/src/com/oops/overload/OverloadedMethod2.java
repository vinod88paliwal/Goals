package com.oops.overload;

public class OverloadedMethod2 {
	
	public void test(B obj) {
		  System.out.println("B");
		 }
		  
		 public void test(C obj) {
		  System.out.println("C");
		 }
		  
		 public static void main(String[] args) {
		  OverloadedMethod2 obj = new OverloadedMethod2();
		  obj.test(null);
		 }
}

class A{}
class B extends A{}
class C extends B{}


/*
Output : C
Output is "C" because test(null) method call maps to method which contains parameter as class which is lowest in class hierarchy. 

		A -> B -> C

*/