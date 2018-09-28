package com.ds.problems;

/**
 * Created by vpaliwal on 9/15/17.
 */
public class RepeatElementsInArray02 {

    void printRepeating(int arr[], int size)
    {
        /* Will hold xor of all elements */
        int xor = arr[0];

        /* Will have only single set bit of xor */
        int set_bit_no;

        int index;
        int n = size - 2;
        int x = 0, y = 0;

         /* Get the xor of all elements in arr[] and {1, 2 .. n} */
        for(index = 1; index < size; index++)
            xor ^= arr[index];
        for(index = 1; index <= n; index++)
            xor ^= index;

        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = xor & ~(xor-1);

        /* Now divide elements in two sets by comparing rightmost set
           bit of xor with bit at same position in each element. */
        for(index = 0; index < size; index++)
        {
            if((arr[index] & set_bit_no) != 0)
                x ^= arr[index]; /*XOR of first set in arr[] */
            else
                y ^= arr[index]; /*XOR of second set in arr[] */
        }
        for(index = 1; index <= n; index++)
        {
            if((index & set_bit_no) != 0)
                x ^= index; /*XOR of first set in arr[] and {1, 2, ...n }*/
            else
                y ^= index; /*XOR of second set in arr[] and {1, 2, ...n } */
        }
        System.out.println("The two repeating elements are  "+ x +" "+ y);
    }

    public static void main(String[] args)
    {
        RepeatElementsInArray01 repeat = new RepeatElementsInArray01();
        int arr[]  = {0, 2, 4, 1, 2, 4, 0, 5};//{4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }

}
