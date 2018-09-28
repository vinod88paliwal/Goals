package com.ds.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-such-that-even-positioned-are-greater-than-odd/
public class RearrangeEvenPositionedGreaterThanOdd {

	
	static void assign(int a[], int n) {
	     
	    // Sort the array
	    Arrays.sort(a);
	 
	    int ans[] = new int[n];
	    int p = 0, q = n - 1;
	    for (int i = 0; i < n; i++) {
	         
	    // Assign even indexes with maximum elements
	    if ((i + 1) % 2 == 0)
	          ans[i] = a[q--];
	    	//ans[i] = a[i+1]; --> This will not work for duplicate data in Array.
	 
	    // Assign odd indexes with remaining elements
	    else
	        ans[i] = a[p++];
	    }
	 
	    // Print result
	    for (int i = 0; i < n; i++)
	    System.out.print(ans[i] + " ");
	}
	 
	// Driver code
	public static void main(String args[]) {
	      int A[] = {1, 3, 2, 2, 5};
		//int A[] = { 12, 3, 5, 7, 4, 19, 26 }; //3 5 4 12 5 26 7 
		                                     //3 26 4 19 5 12 7 
	    int n = A.length;
	    assign(A, n);
	}
	}
//Time complexity : O(Log n)