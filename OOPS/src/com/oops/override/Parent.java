package com.oops.override;

class A1 {
}

class A2 extends A1 {
}

class A3 extends A1 {
}

class Parent {
	protected Number connect(Number a1) {
		System.out.println("Doing connection in Parent way");
		return null;
	}
}

class Child extends Parent {
	
	/*@Override
	public Long connect(A2 a2) {
		System.out.println("Doing connection in Child way");
		return null;
	}*/
	
/*	
This problem occurred because Child class overriding method accepted specific(Subclass) argument compared to Parent class method which is accepting generic argument.
To avoid this situation, parameter in overriding method must be exactly same. 
*/	
}