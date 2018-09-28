package com.oops.overload;

public class OverloadedMethod1 {
	public void test(String str) {
		System.out.println("String");
	}

	public void test(StringBuffer obj) {
		System.out.println("buffer");
	}

	public static void main(String[] args) {
		OverloadedMethod1 obj = new OverloadedMethod1();
		//obj.test(null);
	}
}

/*

Output : Compile time error: 
		  The method test(String) is ambiguous for the type OverloadedMethod
		  
Why compiler doesn't able to resolve overloaded method call this time?
StringBuffer and String class are both at same level in Object hierarchy, So in this case Compiler will not able to resolve which method to invoke and it gives Compile time error.		  
	
	Object -> String
           -> StringBuffer
*/