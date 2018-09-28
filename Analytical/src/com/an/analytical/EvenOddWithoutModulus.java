package com.an.analytical;

public class EvenOddWithoutModulus {

	public static void main(String[] args) {
		
		int val=50;
	    
		while(val>=0)
	    {
	        if(val==1)
	        {
	            System.out.println("Odd Number");
	        }
	        else if(val==0)
	        {
	            System.out.println("Even Number");
	        }
	            val -= 2;
	       //  System.out.println(val);

	    }
	}
	
}
