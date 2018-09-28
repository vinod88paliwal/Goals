package foreachmethod;

import java.util.Arrays;
import java.util.List;

public class forEachDemo {

	public static void main(String args[]) {

		List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);

		// forEach example to print each element of list in this case we are using method reference because
		// we are not doing anything with each element of collection and just passing it to println() method
		System.out.println("Printing elements of list using forEach method : ");
		   listOfPrimes.stream().forEach(System.out::print);
		   System.out.println();

		
		listOfPrimes.stream().forEach(
				i -> {System.out.println(i);
					//listOfPrimes.add(33); //Exception in thread "main" java.lang.UnsupportedOperationException
					}
					);
		
	
		// let's do something to each element before printing --> we will add comma after each element
		System.out.println("Printing elements after adding comma: ");
		listOfPrimes.stream().forEach(i -> System.out.print(i + ","));

		// you can also use forEach with parallel stream ---> order will not be guaranteed
		System.out.println("\nPrinting elements of list using parallel stream: ");
		listOfPrimes.parallelStream().forEach(i -> System.out.println(i));
		
		System.out.println("Multiplying elements with 2 : ");
		listOfPrimes.parallelStream().forEach(i -> System.out.println(i * 2));
		
		System.out.println("Parallel Stream with Ordered ForEach() : ");
		listOfPrimes.parallelStream().forEachOrdered(i -> System.out.println(i));
		
		System.out.println("\nPrinting elements of list using Iterable Interface foeEach() method: ");
		listOfPrimes.forEach(i -> System.out.println(i));

	}

}
