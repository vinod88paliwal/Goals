package com.ds.arrays;
//https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
public class RearrangeElementsWithMultiplicationPreviousAndNext {

	public static void main(String[] args) {
	
		int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        
        int prev = arr[0];
        arr[0] = arr[0] * arr[1]; 
        
        for(int i =1; i<n-1 ; i++)
        {
        	// Store current value of next interation
        	int curr = arr[i];
        	
        	// Update current value using previos value
        	arr[i] = prev * arr[i+1];
        	
        	//now curr would becpome prev
        	prev = curr;
        }
        
        for(int i : arr)
        	System.out.print(i+" ");
	}
}

/*
 Time Complexity : O(n) 
 Auxiliary Complexity : O(1)
An efficient solution can solve the problem in O(n) time and O(1) space. The idea is to keep track of previous element in loop.
*/