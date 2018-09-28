package com.ds.arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
public class SumClosestToX {

	static void minAbsSumPairCloseToX(int arr[], int n,int x)
	{
		 /* Array should have at least two elements*/
	      if(n < 2)
	      {
	        System.out.println("Invalid Input");
	        return;
	      }
	   // Initialize the diff between pair sum and x.
	        int diff = Integer.MAX_VALUE;
		     
		  // left and right index variables
		     int l=0, r =n-1;
		  
		  // variable to keep track of the left and right pair for min_sum   
		     int min_l = l, min_r =r;
		      
			  //First sort the array using merge sort
		      Arrays.sort(arr, l, r);
		      
		      while (l < r) {
		    	  
		   //If this pair is closer to x than the previously found closest, then update res_l, res_r and diff
		    	  if(Math.abs(arr[l] + arr[r] -x) < diff)
		    	  {
		    		  diff = Math.abs(arr[l] + arr[r] -x);
		    		  min_l =l;
		    		  min_r =r;
		    	  }
		  // If sum of this pair is more than x, move to smaller side
		    	  if(arr[l] + arr[r]  >x)
		    		  r--;
		    	  else  // move to the greater side
		    		  l++;
		      }		      
		      System.out.println(" The closest pair is "+arr[min_l] +" and "+arr[min_r] ); 
	}
	
	static void minAbsSumPairCloseToX(int arr1[], int arr2[],int x)
	{
		int n1 = arr1.length;  int n2 = arr2.length;
		
		// Initialize the diff between pair sum and x.
	        int diff = Integer.MAX_VALUE;
		     
	     // Start from left side of arr1[] and right side of arr2[]
		     int l=0, r =n2-1;
		  
		  // variable to keep track of the left and right pair for min_sum   
		     int min_l = l, min_r =r;
		      
		//First sort the arrays using merge sort if not sorted
		      Arrays.sort(arr1, l, n1-1);
		      Arrays.sort(arr2, l, n2-1);
		      
		      while (l < n2 && r >= 0 ) {
		//If this pair is closer to x than the previously found closest, then update res_l, res_r and diff  	  
		    	  if(Math.abs(arr1[l] + arr2[r] - x) < diff)
		    	  {  
		    		  min_l = l;
		    		  min_r =r;
		    		  diff = Math.abs(arr1[l] + arr2[r] - x);
		    	  }
		  // If sum of this pair is more than x, move to smaller side
		    	  if(arr1[l] + arr2[r] > x)
		    		  r--;
		    	  else // move to the greater side
		    		  l++;
		      }
		
		System.out.println(" The closest pair is "+arr1[l] +" and "+arr2[min_r] ); 
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 5, 7,10, 20, 30, 40};
		int n = arr.length;
		int x=38;
		
		minAbsSumPairCloseToX(arr,n,x);
		
		int arr1[] = {1, 4, 5, 7};
        int arr2[] = {10, 20, 30, 40};
        
		minAbsSumPairCloseToX(arr1,arr2,x);
	}
}
/*
Time Complexity : O(n)
Algo :
1) Initialize a variable diff as infinite (Diff is used to store the 
   difference between pair and x).  We need to find the minimum diff.
2) Initialize two index variables l and r in the given sorted array.
       (a) Initialize first to the leftmost index in ar1:  l = 0
       (b) Initialize second  the rightmost index in ar2:  r = n-1
3) Loop while  l = 0
       (a) If  abs(ar1[l] + ar2[r] - sum) < diff  then 
           update diff and result 
       (b) Else if(ar1[l] + ar2[r] <  sum )  then l++
       (c) Else r--    
4) Print the result. 
*/