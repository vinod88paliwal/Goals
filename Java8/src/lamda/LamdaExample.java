package lamda;

import java.util.*;

public class LamdaExample {
	public static void main(String[] args) {
	
		//Before Java 8:
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Before Java8, too much code for too little to do");
		    }
		}).start();

		//Java 8 way:
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
/******************************************************************/

		  //Prior Java 8 :
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
		   System.out.println("Prior Java 8 --> "+feature);
		}

		//In Java 8:
		List<String> features8 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features8.forEach(n -> System.out.println("In Java 8 ==> "+n));
		
		// Even better use Method reference feature of Java 8
		// method reference is denoted by :: (double colon) operator
		// looks similar to score resolution operator of C++
		features.forEach(System.out::println);

	}
	
}
