package funtionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface{
   
	abstract void display();
   			//or 
   //void display(); //same as above 
   
  // void anotherDisplay();//shows an error, FunctionalInterface should have only one abstract method.
	
	
	//But FunctionalInterface can have one or more default methods.
	default void show(){
	     System.out.println("Default method from interface can have body..!");
	  }
	
	//But FunctionalInterface can have one or more static methods
	static void show1(){
	     System.out.println("Default method from interface can have body..!");
	  }
}
