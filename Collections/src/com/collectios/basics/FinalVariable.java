package com.collectios.basics;

public class FinalVariable {
	private final int i =10; //Initialised while declaration itself.
	private final int j; //Initialised in constructor.
	private final static int k; //Initialised in static block.
	private final int l; //Initialised in instance block.
	
	FinalVariable(int j){
		this.j = j;
	}
 	
	static {
 		k =60;
 		}

	{
		l =20;
	}

}
