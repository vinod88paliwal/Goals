package com.ds.problems;

/**
 * Created by vpaliwal on 9/10/17.
 */
//Note : Assuming that all the elements of an Array are Positive
//To handle negative values as well : com.ds.problems.SubarraySumForNegativeValuesAsWell
public class SubarraySum {


    private boolean subArraySum(int[] arr, int size, int sum) {

        int curr_sum = arr[0], start=0;

        // Pick a starting point
        for (int i =1; i<size ; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum -= arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum){

                int temp = i-1;
                System.out.println("Sum "+sum+ " found between indexes " + start+ " and " + temp);
                return true;
            }

            // Add this element to curr_sum
            if (i < size)
                curr_sum += arr[i];
        }
        System.out.println("No subarray found");
        return false;
    }

    public static void main(String[] args) {

        SubarraySum obj = new SubarraySum();
        int arr[] = {15, 1, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 21;
        obj.subArraySum(arr, n, sum);
    }
}
/*
 Time complexity: O(n),
Time complexity of method 2 looks more than O(n), but if we take a closer look at the program, then we can figure out the time complexity is O(n).
We can prove it by counting the number of operations performed on every element of arr[] in worst case. There are at most 2 operations 
performed on every element: (a) the element is added to the curr_sum (b) the element is subtracted from curr_sum. So the upper bound on number
 of operations is 2n which is O(n).
 */
