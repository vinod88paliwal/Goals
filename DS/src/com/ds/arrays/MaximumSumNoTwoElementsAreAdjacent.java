package com.ds.arrays;
//https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
public class MaximumSumNoTwoElementsAreAdjacent {

	public static void main(String[] args) {
		
		int arr[] = new int[]{5, 5, 10, 100, 10, 5};
		int size = arr.length;
		
		 int incl = arr[0]; //Max sum including the previous element 
	     int excl = 0;     //Max sum excluding the previous element
	     int excl_new;

	     for(int i=1; i< size; i++) {

	    	 /* current max excluding i */
	    	 excl_new = (incl > excl) ? incl : excl;
	    	 
	    	 /* current max including i */
	    	 incl =excl + arr[i];
	    	 excl = excl_new;
	     }
	     
	     /* return max of incl and excl */
	     int maxSum = (incl > excl) ? incl : excl;
	     
	     System.out.println("Max Sum : "+maxSum);
	}
}
//Time Complexity: O(n)
/*
Algorithm:
Loop for all elements in arr[] and maintain two sums incl and excl where incl = Max sum including the previous element and excl = Max sum excluding the previous element.

Max sum excluding the current element will be max(incl, excl) and max sum including the current element will be excl + current element (Note that only excl is considered because elements cannot be adjacent).

At the end of the loop return max of incl and excl.

Example:

  arr[] = {5,  5, 10, 40, 50, 35}

  inc = 5 
  exc = 0

  For i = 1 (current element is 5)
  incl =  (excl + arr[i])  = 5
  excl =  max(5, 0) = 5

  For i = 2 (current element is 10)
  incl =  (excl + arr[i]) = 15
  excl =  max(5, 5) = 5

  For i = 3 (current element is 40)
  incl = (excl + arr[i]) = 45
  excl = max(5, 15) = 15

  For i = 4 (current element is 50)
  incl = (excl + arr[i]) = 65
  excl =  max(45, 15) = 45

  For i = 5 (current element is 35)
  incl =  (excl + arr[i]) = 80
  excl =  max(65, 45) = 65

And 35 is the last element. So, answer is max(incl, excl) =  80

*/