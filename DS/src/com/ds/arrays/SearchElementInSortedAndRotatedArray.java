package com.ds.arrays;

import java.util.Arrays;

public class SearchElementInSortedAndRotatedArray {

	/* Searches an element key in a pivoted sorted array arrp[] of size n */
	private static int pivotedBinarySearch(int arrp[], int n, int key) {

		int pivot = findPivot(arrp, 0, n-1);//Pivot is highest element among sorted elements (or last element in sorted elements and after this(highest) element array is rotated)
		System.out.println("Pivot is : "+pivot);
		
		 // If we didn't find a pivot, then array is not rotated at all
			if(pivot == -1)
				return binarySearch(arrp, 0, n-1, key );
		
		// If we found a pivot, then first compare with pivot and then search in two subarrays around pivot.
			if(arrp[pivot] ==key)
				return pivot;
			if(arrp[0] <= key)
				return binarySearch(arrp, 0, pivot-1, key);

			return binarySearch(arrp, pivot+1, n-1, key);	
	}
	
	/* Function to get pivot. For array 
    3, 4, 5, 6, 1, 2 it returns 3 (index of 6) */
	private static int findPivot(int[] arr, int low, int high) {
		
		// base cases
			if(high < low)
				return -1;
			if(high == low)
				return low;
			
		/* low + (high - low)/2; */
		   int mid = (low + high)/2;   
		   
			if(mid < high && arr[mid+1] < arr[mid])
				return mid;
			if(mid > low && arr[mid -1] > arr[mid])
				return (mid-1);
			
			if ( arr[mid] < arr[high])
				return findPivot(arr, low, mid-1);
			
		return  findPivot(arr, mid+1,high);
	}	

	/* Standard Binary Search function */
	private static int binarySearch(int[] arr, int low, int high, int key) {
		
		if(high < low)
			return -1;
		
		/* low + (high - low)/2; */ 
		int mid = (low+high)/2;
		if(key == arr[mid])
			return mid;
		if(key > arr[mid])
			return binarySearch(arr, mid+1,high, key);
		
		return binarySearch(arr, low, mid-1, key);
	}
	
public static void main(String[] args) {
		
		// Lets search 3 in below array
	       int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
	       
	       int n = arr1.length;
	       int key = 2;

	       System.out.println("Index of the element is : " + pivotedBinarySearch(arr1, n, key));
	}
}
//Time Complexity O(logn).

/* Examples : 
Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
Output : Found at index 3
*/