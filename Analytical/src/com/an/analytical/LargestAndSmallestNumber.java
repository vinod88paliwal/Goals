package com.an.analytical;

public class LargestAndSmallestNumber {
	public static void main(String[] args) {

		int[] numbers = new int[] { 32, 43, 53, 54, 32, 65, 2, 63, 98, 43, 23,23 };
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int no : numbers) {
			
			if(no > largest)
			   largest=no;
			
			else if(no < smallest)
				smallest =no;
		}

		System.out.println("Largest Number : " + largest+" , Smallest Number : " + smallest);
	}
}
