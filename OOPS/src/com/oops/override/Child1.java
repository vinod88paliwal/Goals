package com.oops.override;
/*
Unchecked Exception:  
Overriding method in Child class can throw any number of Unchecked Exception irrespective of Parent class overriden method has declared any Checked/Unchecked Exception or not.  
Below example shows valid overriden method connect() and connect1().
*/

import java.io.IOException;

class Parent1 {
	
	protected Object connect(String s1) {
		System.out.println("Doing connection in Parent way");
		return null;
	}

	protected Object connect1(String s1) throws IOException {
		System.out.println("Doing connection in Parent way");
		return null;
	}
}

 public class Child1 extends Parent1 {
	@Override
	public Integer connect(String s2) throws RuntimeException, NullPointerException {
		System.out.println("Increasing visibility and throwing RuntimeException/Unchecked Exception in Child");
		return null;
	}

	@Override
	protected Object connect1(String s1) throws RuntimeException {
		System.out.println("Doing connection in Child way");
		return null;
	}

	public static void main(String[] args) throws IOException {
		
		Parent1 p1 = new Parent1();
		p1.connect("aa");  p1.connect1("aa");
		
		Child1 c1 = new Child1();
		c1.connect("hello"); c1.connect1("hello");
		
		Parent1 pc1 = new Child1();
		pc1.connect("hello"); pc1.connect1("hello");
		
		
	}
}