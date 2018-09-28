package methodreference;

public class StaticMethodReference {
	
	public static void saySomething() 
	{
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
	
		// Referring static method
		Sayable sayable = StaticMethodReference::saySomething;
		// Calling interface method
		sayable.say();
	}
}