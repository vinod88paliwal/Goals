package lamda;

import java.util.Arrays;
import java.util.List;

public class LamdaExample2 {

	public static void main(String[] args) {
		
		List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
		
		listOfPrimes.stream().filter(n -> n%2==0 ).forEach(p ->System.out.print(p));
		
		
	}
	
}
