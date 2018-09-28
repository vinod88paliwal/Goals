package foreachmethod;

import java.util.Arrays;
import java.util.List;

public class ForEachWithList {

	public static void main(String[] args) {

		List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);

		// Without Stream
		listOfPrimes.forEach(i -> System.out.print(" 0 --> " + i));
		System.out.println();

		// With Stream
		listOfPrimes.stream().forEach((i) -> {
			System.out.print(" 1==> " + i);
		});
		System.out.println();
		// OR Same
		listOfPrimes.stream().forEach(i -> {
			System.out.print(" 2==> " + i);
		});
		System.out.println();
		// OR Same
		listOfPrimes.stream().forEach((i) -> System.out.print(" 3==> " + i));
		System.out.println();
		// OR Same
		listOfPrimes.stream().forEach(i -> System.out.print(" 4==> " + i));
		System.out.println();

		System.out.println("Using filter with on Stream()");

		listOfPrimes.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println();
		// OR
		listOfPrimes.stream().filter(i -> i % 2 == 0).forEach(i -> {
			System.out.print(" 5==> " + i);
		});
		System.out.println();
		// OR
		listOfPrimes.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(" 6==> " + i));

	}

}
