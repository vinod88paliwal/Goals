package com.ds.problems;

/**
 * Created by vpaliwal on 9/5/17.
 */

//This method works in O(n) time of range of numbers is known

public class PairSumXHashTable {

    private static final int MAX = 100000; // Max size of Hashmap

    static void printpairs(int arr[],int sum)
    {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];

        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }

    // Main to test the above function
    public static void main (String[] args)
    {
        //int A[] = {3,5,8,3,4,9,7,8,6}; //{1, 4, 45, 6, 10, 8};
        //int n = 10; // 16;
        
        int A[] = {11, 15, 6, 8, 9, 10};
        int n = 16;
        
        printpairs(A,  n);
    }
}
