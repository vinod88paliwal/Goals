package com.ds.arrays;

import java.util.stream.*;
//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
public class EqulibriumIndexAndSum {

	static void findEqulibriumIndex(int []arr, int size)
	{
		int sum= IntStream.of(arr).sum();
				
		 int leftSum=0;
		 int i=0;
		 for(i=0; i<size ; i++)
		 {
			 sum -=arr[i];
			 
			 if(leftSum == sum)
			 {
				 System.out.println("Equlibrium Index :  "+i +" , Sum : "+sum);
			 break;
			 }
			 leftSum += arr[i];
		 }
		 if(i == size)
			 System.out.println("Equlibrium Index not found ");

	}
	
	public static void main(String[] args) 
	{
		 //int arr[] = {7,1,2,4,6,4,0};
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
	       findEqulibriumIndex(arr,arr.length);
	       
	}

}

/*
Time complexity: O(n)
Space complexity: O(1)
Algo :
1) Initialize leftsum  as 0
2) Get the total sum of the array as sum
3) Iterate through the array and for each index i, do following.
    a)  Update sum to get the right sum.  
           sum = sum - arr[i] 
       // sum is now right sum
    b) If leftsum is equal to sum, then return current index. 
    c) leftsum = leftsum + arr[i] // update leftsum for next iteration.
4) return -1 // If we come out of loop without returning then
             // there is no equilibrium index
*/