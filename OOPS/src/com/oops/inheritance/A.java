package com.oops.inheritance;

public class A {

	private void priv()
	{
		System.out.println("A priv()");
	}
	public void show(int i){
		System.out.println("show(int i) -- A");
	}
	
	public int show1(char a){
		System.out.println("show1(char a) -- A");
		return 9;
	}
	//static method can`t be overridden	
	public static int show2(char a){
		System.out.println("static show2(char a) -- A");
		return 9;
	}
	
	public int show5(char a){
		System.out.println("show5(char a) -- A");
		return 9;
	}
	
}
