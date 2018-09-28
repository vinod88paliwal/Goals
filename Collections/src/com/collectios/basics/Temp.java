package com.collectios.basics;

public class Temp {

	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("Before");

			//System.exit(1);
			System.out.println("After");
			throw new Exception();
			
		}catch (Exception e) {
		
			System.out.println("Exception");
		}finally{
			
			System.out.println("Finally");
		}
		
		
		
	}
	
}
