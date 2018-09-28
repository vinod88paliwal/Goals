package com.ds.searching;

/**
 * Created by vpaliwal on 4/9/18.
 */

/*
A linear search can work on sorted and on unsorted data.

The procedure:

    It sequentially checks each element of the array/list for the target value until a match is found or until all the elements have been searched.

Complexity :

Time : O(n)

*/
public class LinearSearch {

    int linearSearch(int[] arr, int size , int target)
    {
        for (int i=0; i<size ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        LinearSearch obj = new LinearSearch();

        int[] arr = { 0, 1, 2, 5, 12, 17, 30 };

        int target = 12;
        int idx = obj.linearSearch(arr, arr.length , target);

        System.out.println(target  + " is at index: " + idx);
    }
}
