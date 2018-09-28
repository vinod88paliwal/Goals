package com.oops.overload;

public class OverloadedMethod4 {
	public void test(int[] intArr) {
		  System.out.println("int array");
		 }
		  
		 public void test(char[] charArr) {
		  System.out.println("char array");
		 }
		  
		 public static void main(String[] args) {
			 OverloadedMethod4 obj = new OverloadedMethod4();
			  //obj.test(null, null);   //Output: Compile time error.
			 
			 //For testing below program.
			 Testing t = new Testing();
			 t.test();
		 }
}

/*
Output: Compile time error.
              int[] is class with name "[I" and superclass of int[] is java.lang.Object.
              char[] is class with name "[C" and superclass of char[] is java.lang.Object.
              
So both the classes int[] and char[] are at same level to Object class and fall in different hierarchy, so compiler will not able to resolve as which method to invoke.   
*/

/*
Note:
int is primitive type in java but int[] is not primitive and it is class which extends Object class.
you can pass null to int[] because it is object and passing null to int will give compiler error.

You can execute below lines to get the facts,

*/

class Testing{
	
	void test() {
		   System.out.println(int[].class.isPrimitive());
		   System.out.println(int[].class.getName());
		   System.out.println(int[].class.getSuperclass());
		    
		   System.out.println(int.class.isPrimitive());
		   System.out.println(int.class.getName());
		   System.out.println(int.class.getSuperclass());
		 
		   Object ref=new int[]{1,2,3};   // valid statement?
		//   Object[] ref=new int[]{1,2,3}; // valid statement?
	}
}