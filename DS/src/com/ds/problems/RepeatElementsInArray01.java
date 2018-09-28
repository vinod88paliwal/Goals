package com.ds.problems;

/**
 * Created by vpaliwal on 9/15/17.
 */

//Note : This program can find duplicate elements if duplicate element occurred exactly twice and not more than that!!!
//Traverse the array once. While traversing, keep track of count of all elements in the array using a temp array count[] of size n,
// when you see an element whose count is already set, print it as duplicate
public class RepeatElementsInArray01 {

    void printRepeating(int arr[], int size)
    {
        int count[] = new int[size];
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++)
        {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    public static void main(String[] args)
    {
        RepeatElementsInArray01 repeat = new RepeatElementsInArray01();
        int arr[] = {0, 2, 4, 1, 2, 4, 0,5};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}
// Time Complexity: O(n), Auxiliary Space: O(n)