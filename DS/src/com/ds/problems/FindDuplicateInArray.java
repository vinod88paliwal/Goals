package com.ds.problems;

/**
 * Created by vpaliwal on 9/13/17.
 */
//Note : This program will not work properly if array contains 0 (zero).
public class FindDuplicateInArray {

    private void printRepeating(int[] arr, int size) {

        System.out.println("The repeating elements are : ");

        for(int i=0; i<size ; i++)
        {
            if(arr[Math.abs(arr[i])] >=0)

                arr[Math.abs(arr[i])] =  -arr[Math.abs(arr[i])];

            else
                System.out.println(Math.abs(arr[i]));
        }
    }
    public static void main(String[] args) {

        FindDuplicateInArray obj = new FindDuplicateInArray();

        int arr[] = {4, 2, 4, 5, 2, 3, 1};

        obj.printRepeating(arr,arr.length);
    }
}
// Time Complexity: O(n), Auxiliary Space: O(1)
