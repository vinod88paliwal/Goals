package com.vinod.newanalytical;

//Taking care for duplicates as well
public class MaxMinElementSortedRotatedArray {
	/*
Example : 
Input: {5, 6, 1, 2, 3, 4}
Output: 1

Input: {1, 2, 3, 4}
Output: 1

Input: {2, 1}
Output: 1
	 
Algo:

1. The minimum element is the only element whose previous is greater than it. If there is no previous element element, then there is no rotation (first element is minimum). We check this condition for middle element by comparing it with (mid-1)’th and (mid+1)’th elements.
2. If minimum element is not at middle (neither mid nor mid + 1), then minimum element lies in either left half or right half.
     A) If middle element is smaller than last element, then the minimum element lies in left half
     B) Else minimum element lies in right half.
*/
	static int findMax(int[] arr, int low, int high) {
		// This condition is needed to handle the case when array is not rotated at all
		if (high == low)
			return arr[high];

		// If there are two elements and first or second whichever is greater then that
		// element is maximum and return same.
		if (high == low + 1)
			return Math.max(arr[low], arr[high]);

		int mid = low + (high - low) / 2;

		// already sorted
		if (arr[high] > arr[low])
			return arr[high];

		// right shift one
		else if (arr[high] == arr[low])
			return findMax(arr, low + 1, high);

		// go right
		else if (arr[mid] >= arr[low])
			return findMax(arr, low + 1, high);
		// go left
		else // if(arr[mid] < arr[low])
			return findMax(arr, low, mid);
	}
	
  static  int findMin(int []arr , int low , int high)
  {
		// This condition is needed to handle the case when array is not rotated at all
		if(high == low)
		    return arr[low];

  	//  If there are two elements and first or second whichever is greater then that  element is maximum and return same.
		  if(high == low +1)
	           return Math.min(arr[low], arr[high]);

		  int mid = low + (high - low)/2;
		  
	// already sorted  
	if(arr[high] > arr[low])
		return arr[low];
		
	//right shift one
	else if(arr[high] == arr[low])
		return findMin(arr, low+1, high);
	
   //go right
	else if(arr[mid] >= arr[low])
		return findMin(arr, mid+1, high); //OR findMin(arr, low+1, high);
   //go left
	else // if(arr[mid] < arr[low])
		return findMin(arr, low, mid); 
		
	}
	
	public static void main(String[] args) {

	/*	int arr1[] = {1,3,3};
		int n1 = arr1.length;
		System.out.println("The minimum element is "+ findMax(arr1, 0, n1-1));

		int arr2[] = {1, 2, 3, 4};
		int n2 = arr2.length;
		System.out.println("The minimum element is "+ findMax(arr2, 0, n2-1));

		int arr3[] = {1};
		int n3 = arr3.length;
		System.out.println("The minimum element is "+ findMax(arr3, 0, n3-1));

		int arr4[] = {1, 2};
		int n4 = arr4.length;
		System.out.println("The minimum element is "+ findMax(arr4, 0, n4-1));

		int arr5[] = {2, 1};
		int n5 = arr5.length;
		System.out.println("The minimum element is "+ findMax(arr5, 0, n5-1));

		int arr6[] = {5, 6, 7, 1, 2, 3, 4};
		int n6 = arr6.length;
		System.out.println("The minimum element is "+ findMax(arr6, 0, n6-1));

		int arr7[] = {1, 2, 3, 4, 5, 5, 7};
		int n7 = arr7.length;
		System.out.println("The minimum element is "+ findMax(arr7, 0, n7-1));

		int arr8[] = {2, 3, 4, 5, 6, 7, 8, 1};
		int n8 = arr8.length;
		System.out.println("The minimum element is "+ findMax(arr8, 0, n8-1));

		int arr9[] = {3, 4, 5, 1, 2};
		int n9 = arr9.length;
		System.out.println("The minimum element is "+ findMax(arr9, 0, n9-1));*/
		
		int arr1[] = {1,3,3};
		int n1 = arr1.length;
		System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1));

		int arr2[] = {1, 2, 3, 4};
		int n2 = arr2.length;
		System.out.println("The minimum element is "+ findMin(arr2, 0, n2-1));

		int arr3[] = {1};
		int n3 = arr3.length;
		System.out.println("The minimum element is "+ findMin(arr3, 0, n3-1));

		int arr4[] = {1, 2};
		int n4 = arr4.length;
		System.out.println("The minimum element is "+ findMin(arr4, 0, n4-1));

		int arr5[] = {2, 1};
		int n5 = arr5.length;
		System.out.println("The minimum element is "+ findMin(arr5, 0, n5-1));

		int arr6[] = {5, 6, 7, 1, 2, 3, 4};
		int n6 = arr6.length;
		System.out.println("The minimum element is "+ findMin(arr6, 0, n6-1));

		int arr7[] = {1, 2, 3, 4, 5, 5, 7};
		int n7 = arr7.length;
		System.out.println("The minimum element is "+ findMin(arr7, 0, n7-1));

		int arr8[] = {2, 3, 4, 5, 6, 7, 8, 1};
		int n8 = arr8.length;
		System.out.println("The minimum element is "+ findMin(arr8, 0, n8-1));

		int arr9[] = {3, 4, 5, 1, 2};
		int n9 = arr9.length;
		System.out.println("The minimum element is "+ findMin(arr9, 0, n9-1));
	}

}
