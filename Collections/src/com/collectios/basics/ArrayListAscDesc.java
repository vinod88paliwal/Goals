package com.collectios.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAscDesc {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		System.out.println(al.add(1));
		System.out.println(al.add(10));
		
		System.out.println("Remove: "+al.remove(3));		
		
		
		//sorting ArrayList in descending or reverse order in Java
		List unsortedList = Arrays.asList("b", "d", "a", "e");
		Collections.sort(unsortedList, Collections.reverseOrder());

		System.out.println("Arraylist in descending order: " + unsortedList);

		/***************************************/
		
		//sorting ArrayList on case insensitive order of String
		unsortedList = Arrays.asList("abc", "bcd", "ABC", "BCD");
		System.out.println("ArrayList before case insensitive sort: " + unsortedList);
		             
		Collections.sort(unsortedList, String.CASE_INSENSITIVE_ORDER);//[abc, ABC, bcd, BCD]
	//	Collections.sort(unsortedList, Collections.reverseOrder());//[bcd, abc, BCD, ABC]
		
		System.out.println("ArrayList after case insensitive sort: " + unsortedList);

		
		
		
	}
	
}
