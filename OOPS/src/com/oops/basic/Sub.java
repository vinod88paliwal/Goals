package com.oops.basic;

class Super {
	
		int i;
		int j;
}

 public class Sub extends Super{

	 
	 void hello()
	 {
		 try {
			
			 System.out.println("Hello");
		} catch (Exception e) {
		}
	 }
	 
	 
	 Sub(int i, int j)
	 {
		super.j = super.i+2;
	 }
	 
	public static void main(String[] args) {
		
		Sub obj = new Sub(1,2);
		
		try {
			obj.hello();
			
		} catch (Error e) {
		}
		
		
		System.out.println(obj.i+" "+obj.j);
	
	}
}