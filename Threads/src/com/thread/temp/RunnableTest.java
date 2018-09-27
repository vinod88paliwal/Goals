package com.thread.temp;

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = new Thread();
		r.wait();
		//r.sleep(); //not overriden method
		
		A obj = new B();
		//obj.hello(); //not overriden method
	}
}

class A{}
class B extends A{
	void hello() {}
}