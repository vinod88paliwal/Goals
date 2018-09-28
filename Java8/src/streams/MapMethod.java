package streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().distinct().map( i -> i*i).collect(Collectors.toList());
				
		//get list of unique squares
		List<Integer> uniqueSquaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
	
		squaresList.stream().forEach(i -> {System.out.println(i);});
	
		uniqueSquaresList.stream().forEach(i -> { System.out.println(i);});
		  
	
		
		
	}
}
