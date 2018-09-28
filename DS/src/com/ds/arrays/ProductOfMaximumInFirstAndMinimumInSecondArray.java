package com.ds.arrays;

public class ProductOfMaximumInFirstAndMinimumInSecondArray {

	private static int minMaxProduct(int[] arr1, int[] arr2, int n1, int n2) {

		// Initialize max & min of first & Second array
		int max = arr1[0]; int min = arr2[0];
		
		int i;
		for(i =1; i< n1 && i <n2 ; ++i)
		{
			// To find the maximum element in first array
				if(arr1[i] > max)
					max =arr1[i];
				
		  // To find the minimum element in second array
				if(arr2[i] < min)
					min = arr2[i];
		
		 //Process remaining elements
				while(i < n1 )
				{
					if(arr1[i] > max)
						max = arr1[i];
					i++;
				}
				
				while(i < n2 )
				{
					if(arr2[i] < min)
						min = arr1[i];
					i++;
				}
		}
		return max * min;
	}
	
	public static void main(String[] args) {

		int [] arr1= new int []{ 10, 2, 3, 6, 4, 1 };
		int [] arr2 = new int []{ 5, 1, 4, 2, 6, 9 };
		
		int s1 = arr1.length;
		int s2 = arr2.length;
		System.out.println(minMaxProduct(arr1,arr2,s1,s2));
	}
}
/*
Time Complexity : O(n)
Space Complexity : O(1)
*/