package streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4);
		
							//OR
		Stream<Integer> stream2 = Stream.of(new Integer[]{1,2,3,4}); 
		//works fine

	//	Stream<Integer> stream3 = Stream.of(new int[]{1,2,3,4}); 
		//Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
	
						//OR
		
		Stream<Long> LongStream  = Arrays.stream(new Long[]{1L,2L,3L,4L});
		
	
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<10; i++) myList.add(i);
				
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
				
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
	
					//OR
		
		stream1.forEach(i -> System.out.println("stream1 : "+i));
		stream2.forEach(i -> System.out.println("stream2 : "+i));
		sequentialStream.forEach(i -> System.out.println("sequentialStream : "+i));
		parallelStream.forEach(i -> System.out.println("parallelStream : "+i));
	
	}
	
}
