package com.vinod.analytical;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	private static void finddupe(List<Integer> numbers) {
		
		List<Integer> withoutdupes = new ArrayList<Integer>();
		
		for (int i : numbers) {
		
			if (withoutdupes.contains(i))
				System.out.println("This is duplicate: " + i);
			else
				withoutdupes.add(i);
		}
	}
	
	public static void main(String a[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(30); numbers.add(25); numbers.add(30);
		finddupe(numbers);
	}

}