package com.ds.problems;

/**
 * Created by vpaliwal on 9/15/17.
 */
//Note : This program will not work properly if array contains 0 (zero).
public class RepeatElementsInArray03 {

    void printRepeating(int arr[], int size)
    {
        System.out.println("The repeating elements are : ");

        for(int i = 0; i < size; i++)
        {
            if(arr[Math.abs(arr[i])] > 0)

                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];

            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }

    public static void main(String[] args)
    {
        RepeatElementsInArray03 repeat = new RepeatElementsInArray03();
        int arr[] =  {6, 2, 4, 3, 2, 4, 3, 5};//{4, 2, 4, 5, 2, 3, 1};
        repeat.printRepeating(arr, arr.length);
    }
}

// Time Complexity: O(n), Auxiliary Space: O(1)
