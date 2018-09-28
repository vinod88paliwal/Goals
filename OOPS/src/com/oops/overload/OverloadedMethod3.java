package com.oops.overload;

public class OverloadedMethod3 {
	public void test(String obj1, Object obj2) {
		  System.out.println("A");
		 }
		  
		 public void test(Object obj1, String obj2) {
		  System.out.println("B");
		 }
		  
		 public static void main(String[] args) {
			 OverloadedMethod3 obj = new OverloadedMethod3();
			  //obj.test(null, null);
		 }
}

/*
Output : Compile time error because method contains parameter in opposite order and none of the test method in this case is more specific and can be resolved.
*/