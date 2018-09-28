package com.ds.arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/find-four-numbers-with-sum-equal-to-given-sum/
public class SumOf4ElementsArray {

	/* A sorting based solution to print all combination of 4 elements in A[] with sum equal to X */
	 static void find4NumbersSumX(int arr[], int n, int x) 
	  {
	        int l, r;
	        
	    // Sort the array in increasing order, using library function for quick sort  
	        Arrays.sort(arr);
	        
	        /* Now fix the first 2 elements one by one and find the other two elements */
	        for (int i = 0; i < n - 3; i++) 
	        {
	            for (int j = i + 1; j < n - 2; j++) 
	            {
	       // Initialize two variables as indexes of the first and last elements in the remaining elements
	                l = j + 1;
	                r = n - 1;
	                
	                while (l < r) 
	                {
	                	if(arr[i]+arr[j]+arr[l]+arr[r] == x)
	                	{
	                		System.out.println("Numbers : "+arr[i]+","+arr[j]+","+arr[l]+","+arr[r]);
	                		return;
	                	}
	                	else if (arr[i]+arr[j]+arr[l]+arr[r] < x)
	                		l++;
	                	else  //arr[i]+arr[j]+arr[l]+arr[r] > x
	                		r--;
	            	} // end of while
				} // end of inner for loop
			} // end of outer for loop
	   } 
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 12};
		int n = arr.length;
		int x = 21;
		
		find4NumbersSumX(arr, n, x);
	}
}
//Time Complexity: O(n3)