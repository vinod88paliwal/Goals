package com.ds.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/rearrange-array-arri/
public class RearrangeArriBecomei {

	 // Function to rearrange an array such that arr[i] = i.
	private static int[] rearrange(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		// Storing all the values in the HashSet
		for(int i : arr) {
			set.add(i);
		}
		
		for(int i=0; i<arr.length ; i++) {
			
			if(set.contains(i))
				arr[i] =i;
			else
				arr[i] = -1;	
		}
		
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		 int arr[] = {-1, -1, 6, 1, 9,
                 3, 2, -1, 4,-1};
                  
     // Function calling
     System.out.println(Arrays.toString(rearrange(arr)));

	}
}


/*
Given an array of elements of length N, ranging from 1 to N. All elements may not be present in the array. If element is not present then 
there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

Approach (Using HashSet) :
1) Store all the numbers present in the array into a HashSet
2) Iterate through the length of the array, if the corresponding position element is present in the HashSet, then set A[i] = i, else A[i] = -1
*/