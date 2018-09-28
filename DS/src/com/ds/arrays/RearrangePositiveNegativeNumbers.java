package com.ds.arrays;
//https://www.cdn.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
public class RearrangePositiveNegativeNumbers {

	
	// Function to Rearrange positive and negative numbers in a array
	static void RearrangePosNeg(int arr[], int l, int r)
	{
		int start = 0;
		int end = arr.length - 1;

		while (start < end) 
		{
			if (arr[start] >= 0 && arr[end] < 0) { //first + and last -
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				end--;
				start++;
			} else if (arr[start] < 0 && arr[end] >= 0) { //first - and last +
				start++;
				end--;
			} else if (arr[start] < 0 && arr[end] < 0) { //both first and last -
				start++;
			} else {  //both first + and last +
				end--;
			}
		}
	}
    
	public static void main(String[] args) {
		
		int arr[] =	{-1, -2, 3, -4, -5, 6, -7, 8};
        int size = arr.length;
        RearrangePosNeg(arr, 0, size - 1);
        
        for(int i : arr)
        	System.out.print(i+" ");
	}
}
// Time complexity : O(n). 
// Auxiliary Space : O(1)