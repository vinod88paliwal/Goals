package com.oops.interfaceabstart;

public abstract class B implements A {

	public abstract void show1();
	public abstract void show2();
	
	public void show3()
	{
		System.out.println("Overidden of A"); // Not necessary to be overridden in subclass
	}
	
	public void show4(){
		System.out.println("Added new concreate method");
	}

	public abstract void show5(); // Added new abstract method --> sub class must override  
}
