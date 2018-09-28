package com.an.analytical;

import java.util.Arrays;

public class DuplicateUsingArraysSort {

	public static void main(String a[]) {
		int[] numbers = { 1, 5, 23, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
		Arrays.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			//System.out.println("[i]: "+numbers[i]);
			//System.out.println("[i - 1]: "+numbers[i - 1]);
			
			if (numbers[i - 1] == numbers[i]) {
				System.out.println("Duplicate: " + numbers[i]);
			}
		}
	}
}