package com.oops.overload;

public class OverloadedMethod0{

/*	void show(int i){    //--> Compile time error ,as can`t overload with only static
		System.out.println("non-static method");
	}*/

	//method can`t be overloaded only via static
	static void show(int i){
		System.out.println("static method");
	}
}
