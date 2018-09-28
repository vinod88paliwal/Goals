package com.ds.arrays;

import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/print-distinct-elements-given-integer-array/
public class DistinctElementsOfGivenArray {

	static void printDistinct(int arr[], int n)
	{
		// Creates an empty hashset
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0 ; i<n ; i++)
		{
			if(! set.contains(arr[i]))
			{
				set.add(arr[i]);
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        printDistinct(arr, n);
		
	}

}
/*
Time Complexity : O(n)
Examples:
Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: 12, 10, 9, 45, 2

Input: arr[] = {1, 2, 3, 4, 5}
Output: 1, 2, 3, 4, 5

Input: arr[] = {1, 1, 1, 1, 1}
Output: 1
*/