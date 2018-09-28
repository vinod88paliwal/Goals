package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollectionOrArray {

	public static void main(String[] args) {
		
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println("List from Stream : "+intList); //prints [1, 2, 3, 4]

		intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
		Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
		System.out.println("Map from Stream : "+intMap); //prints {1=11, 2=12, 3=13, 4=14}

		
//We can use toArray() method of stream to create an array from the stream.
		Stream<Integer> intStreamArr = Stream.of(1,2,3,4);
		Integer[] intArray = intStreamArr.toArray(Integer[]::new);
		System.out.println("Array from Stream : "+ Arrays.toString(intArray)); //prints [1, 2, 3, 4]
	
		}
}
