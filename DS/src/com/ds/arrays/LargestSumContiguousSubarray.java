package com.ds.arrays;
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class LargestSumContiguousSubarray {

	private static int maxSubArraySum(int[] arr) {
		
	 int size = arr.length;
	 int max_so_far =0;
	 int max_ending_here =0;
	 
	 for(int i=0; i< size; i++) {
		
		 max_ending_here += arr[i];
		 
		 if(max_ending_here < 0)
			 max_ending_here = 0;
		 
		 else if(max_so_far < max_ending_here) /* Do not compare for all elements. Compare only when  max_ending_here > 0 */
			 max_so_far = max_ending_here;
	 }
	 return max_so_far;
	}
	
	private static void maxSubArraySumWithStartEndIndexes(int[] arr) {
		
		 int size = arr.length;
		 int max_so_far =0 , max_ending_here =0, start=0, end=0 , s=0;

		 for(int i=0; i< size ; i++) {
			 
			 max_ending_here += arr[i];

			 if(max_so_far < max_ending_here)
			 {
				 max_so_far =max_ending_here;
				 start =s;
				 end =i;
			 }
			 
			 if(max_ending_here <0)
			 {
				 max_ending_here = 0;
				 s = i+1;
			 }
		 }
		 
		 System.out.println("Maximum contiguous sum is " + max_so_far);
		 System.out.println("Start Index : "+start +" , End Index : "+end);
	}
	
	public static void main (String[] args)
    {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
        maxSubArraySumWithStartEndIndexes(arr);
    }
}
//Time Complexity: O(n)
/*
Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far

Lets take the example:
    {-2, -3, 4, -1, -2, 1, 5, -3}

    max_so_far = max_ending_here = 0

    for i=0,  a[0] =  -2
    max_ending_here = max_ending_here + (-2)
    Set max_ending_here = 0 because max_ending_here < 0

    for i=1,  a[1] =  -3
    max_ending_here = max_ending_here + (-3)
    Set max_ending_here = 0 because max_ending_here < 0

    for i=2,  a[2] =  4
    max_ending_here = max_ending_here + (4)
    max_ending_here = 4
    max_so_far is updated to 4 because max_ending_here greater 
    than max_so_far which was 0 till now

    for i=3,  a[3] =  -1
    max_ending_here = max_ending_here + (-1)
    max_ending_here = 3

    for i=4,  a[4] =  -2
    max_ending_here = max_ending_here + (-2)
    max_ending_here = 1

    for i=5,  a[5] =  1
    max_ending_here = max_ending_here + (1)
    max_ending_here = 2

    for i=6,  a[6] =  5
    max_ending_here = max_ending_here + (5)
    max_ending_here = 7
    max_so_far is updated to 7 because max_ending_here is 
    greater than max_so_far

    for i=7,  a[7] =  -3
    max_ending_here = max_ending_here + (-3)
    max_ending_here = 4
*/