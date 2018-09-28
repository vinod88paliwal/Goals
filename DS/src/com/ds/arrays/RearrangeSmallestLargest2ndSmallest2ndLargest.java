package com.ds.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/
public class RearrangeSmallestLargest2ndSmallest2ndLargest {

	/*
	 Time Complexity : O(n)
	   Auxiliary Space : O(n)
	Efficient solution is to use sorting.
	1. Sort the elements of array.
	2. Take two variables say i and j and point them to the first and last index of the array respectively.
	3. Now run a loop and store the elements in the array one by one by incrementing i and decrementing j.

	Let’s take an array with input 5, 8, 1, 4, 2, 9, 3, 7, 6 and sort them so the array become 1, 2, 3, 4, 5, 6, 7, 8, 9. Now take two variables say i and j and point them to the first and last index of the array respectively, run a loop and store value into new array by incrementing i and decrementing j. We get final result as 1 9 2 8 3 7 4 6 5.
	*/
    static void rearrangeArray(int arr[], int n)
    {   
        Arrays.sort(arr);
      
        int[] tempArr = new int[n]; // To store modified array
         
        // Adding numbers from sorted array to new array accordingly
        int ArrIndex = 0;
      
        // Traverse from begin and end simultaneously 
        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2;  i++, j--) {
           
        	if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }
             
            if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }
        }
        
     // Copy temp[] to arr[]
      //  arr = tempArr.clone();
        
        int i=0;
        for(int val : tempArr)
        	arr[i++] =val;
    }
    
    
/*
An efficient solution involves following steps.
1) Sort input array using a O(n Log n) algorithm.
2) We maintain two pointers, one from beginning and one from end in sorted array. We alternatively print elements pointed by two pointers and move them toward each other.   
Time Complexity: O(n Log n)
*/
//https://www.geeksforgeeks.org/alternative-sorting/
    static void rearrangeArray1(int arr[], int n) {
    	
    	Arrays.sort(arr);
    	
    	// Printing the last element of array first and then first element and then 
        // second last element and then second element and so on.
    	
    	int i=0, j =n-1;
    	
    	while (i < j) {
			System.out.print(arr[j--] +" "+arr[i++]+" ");
		}
    	
    	// If the total element in array is odd then print the last middle element.
    	if(n % 2 !=0)
    		System.out.println(arr[i]);
    }
    
    
	public static void main(String[] args) {
		
		 int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
	        int n = arr.length;
	       /* rearrangeArray(arr, n);
	      
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i]+" ");
	    */    
	        rearrangeArray1(arr, n);
	}
}
