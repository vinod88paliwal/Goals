package com.ds.arrays;
//https://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
public class SumClosestToZero {

	 /* Functions for QuickSort */
    
    /* This function takes last element as pivot, places the pivot element at its correct position in sorted array,
        and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
	private static int partition(int[] arr, int low, int high) {

	 int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
}
	/* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low  --> Starting index,
    high  --> Ending index */
	 static void sort(int arr[], int low, int high)
	 {
		 if(low < high)
		 {
			 int mid = partition(arr, low, high);
			 
			// Recursively sort elements before
	            // partition and after partition
	            sort(arr, low, mid-1);
	            sort(arr, mid+1, high);
		 }
	 }
	 
	static void minAbsSumPair(int arr[], int n)
	 {
		 /* Array should have at least two elements*/
	      if(n < 2)
	      {
	        System.out.println("Invalid Input");
	        return;
	      }
	      
	   // Variables to keep track of current sum and minimum sum
	     int sum, min_sum = 999999;
	     
	  // left and right index variables
	     int l=0, r =n-1;
	  
	  // variable to keep track of the left and right pair for min_sum   
	     int min_l = l, min_r =r;
	      
		  //First sort the array using merge sort
	      sort(arr, l, r);
	      
	      while(l < r)
	      {
	    	 sum = arr[l] + arr[r];
	    	 
	    	 /*If abs(sum) is less then update the result items*/
	    	 if(Math.abs(sum) < Math.abs(min_sum))
	    	 {
	    		 min_sum =sum;
	    		 min_l =l;
	    		 min_r =r;
	    	 }
	    	 if(sum <0)
	    		 l++;
	    	 else
	    		 r--;
	      }
	      System.out.println(" The two elements whose sum is minimum are "+arr[min_l] +" and "+arr[min_r] ); 
	 }
	  
	public static void main(String[] args) 
	{
		int arr[] = {1, 60, -10, 70, -80, 85};
		//int arr[] = {1, 60, 85, -10, 70, -80};
        int n = arr.length;
        minAbsSumPair(arr, n);
	}
}
/* Time Complexity:Complexity to sort + Complexity of finding the optimum pair == O(Log n) + O(n)
  Time Complexity: O(n Log n)
  
 */
/*
Algorithm
1) Sort all the elements of the input array.
2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
3) sum = a[l] + a[r]
4) If sum is -ve, then l++
5) If sum is +ve, then r–
6) Keep track of abs min sum.
7) Repeat steps 3, 4, 5 and 6 while l < r
*/