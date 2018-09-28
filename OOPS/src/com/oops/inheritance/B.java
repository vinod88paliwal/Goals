package com.oops.inheritance;

public class B extends A {
	
	private void priv()
	{
		System.out.println("B priv()");
	}
	
	@Override
	public void show(int i){
		System.out.println("show(int i) -- B");
	}
	public void show(int i, int j){
		System.out.println("show(int i, int j) -- B");
	}	
	public int show1(char a){
		System.out.println("show1(char a) -- B");
		return 9;
	}
	//static method can`t be overridden
	public static int show2(char a){
		System.out.println("static show2(char a) -- B");
		return 9;
	}
	
	//static method can`t be overridden
		public int show3(){
			System.out.println("static show2(char a) -- B");
			return 9;
		}
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		A ab = new B();

		System.out.println("-----------AAAAA----------------");		
		a.show(10);
		a.show1('A');
		a.show2('G');
	
		System.out.println("----------BBBBB------------------");
				
		b.show(44);
		b.show(2,3);
		b.show1('B');
		b.show2('H');
		b.show5('D');// Sub class Object calling Super class Method.
		
		System.out.println("----------AAAABBB------------------");
		ab.show(44);
		//ab.show(2,4);// It can call only overridden method of sub class and not non-overridden methods
		ab.show1('C');
		ab.show2('E');
		//ab.show3(); // It can call only overridden method of sub class and not non-overridden methods.
	}
}
