package staticmethod;

public class MyDataImpl3 implements MyData3{

//trying to override method of Object and making it default gives compile time error as
		//"A default method cannot override a method from java.lang.Object"
		
	/*	default public String toString(){
			return "Hello";
		}*/

	//trying to override method of Object and making it static gives compile time error as
	//This static method cannot hide the instance method from Object.
	 /*public static String toString(){
		return "Hello";
	 }*/
	
	
	public static void main(String args[]) {
		
		MyDataImpl3 obj = new MyDataImpl3();
		
		obj.print("");
		//obj.isNull("abc");
//However like other static methods, we can use interface static methods using class name.		
		boolean result = MyData3.isNull("abc");
		System.out.println("Result of Null: "+result);
		
	}
}
