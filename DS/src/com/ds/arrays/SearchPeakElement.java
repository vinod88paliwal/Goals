package com.ds.arrays;

//Note : This program will find only one peak element even though multiple are present in array.

//https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
public class SearchPeakElement {
	 // A binary search based function that returns index of a peak element
    static int findPeakUtil(int arr[], int low, int high, int n)
    {
    	 // Find index of middle element
    	int mid = low +(high -low)/2; /* (low + high)/2 */
    	
    	// Compare middle element with its neighbours (if neighbours exist)
    	 if((mid ==0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1]) )
    		 return mid;
    	 
  // If middle element is not peak and its left neighbour is greater than it,then left half must have a peak element
    	 else if( mid >0 && arr[mid -1] > arr[mid])
    		  return findPeakUtil(arr, low, (mid-1), n);
    	 
 // If middle element is not peak and its right neighbor is greater than it, then right half must have a peak  element
    	else return findPeakUtil(arr, (mid+1), high, n); 
    }

 // A wrapper over recursive function findPeakUtil()
    static int findPeak(int[] arr, int n)
    {
    	return findPeakUtil(arr, 0, n-1, n);
    }
	public static void main(String[] args) {
		//int arr[] = {1, 3, 20, 4, 1, 0};
		  //int arr[] = {9, 8, 7, 6, 5, 4, 1, 3, 2};
		 // int arr[] = {1, 3, 2, 4, 1, 0};
		//int arr[] = {1, 2, 10, 5, 10, 2, 1};
		int arr[] = {10, 15, 9, 20, 25, 30, 35};
        int n = arr.length;
        System.out.println("Index of a peak point is " +findPeak(arr, n));
    }
}
/*
Time Complexity :  O(Logn)
An array element is peak if it is NOT smaller than its neighbors. For corner elements, we need to consider only one neighbor. For example, for input array {5, 10, 20, 15}, 20 is the only peak element. For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90. Note that we need to return any one peak element.

Following corner cases give better idea about the problem.
1) If input array is sorted in strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
2) If input array is sorted in strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
3) If all elements of input array are same, every element is a peak element.
*/