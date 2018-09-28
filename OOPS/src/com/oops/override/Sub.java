package com.oops.override;

public class Sub extends Sup{

	@Override
	void hello()
	{
		System.out.println("Sub !!!");
	}
	
	void hello(int i)
	{
		System.out.println("Sub int i ----!!!");
	}
	
	
	public static void main(String[] args) {
		
	/*	Sup obj = new Sup(); // Only Super class methods can be called
		obj.hello();
		//obj.hello(9);// because it tries to call Super class methods but no method present in Super class with hello(int i).
		
		Sub obj1 = new Sub(); // Only Sub class methods can be called.
		obj1.hello(9);
		obj1.hello();*/
		
		Sup obj2 = new Sub(); // Can call Super class methods and Overriden methods from subclasss.
		obj2.hello();
		obj2.hello(2, 2);
		//obj2.hello(9); // because it tries to call Super class methods or overridden sub class methods.
	}
}
