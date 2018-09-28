package com.ds.searching;
/*
 A binary search requires an array that is already sorted.

The procedure:

    A binary search starts with the element in the middle of the array.

    If that element is the desired value, the search is over.

    Otherwise, the value in the middle element is either greater or less than the desired value.

    If it is greater than the desired value, search in the first half of the array.

    Otherwise search the last half of the array.

    Repeat as needed while adjusting the start and end points of the search.

Complexity :

Time : O(logn)

 */

public class BinarySearchDemo {

	public static void main(final String[] args) {
        final int[] array = { 0, 1, 2, 5, 12, 17, 30 };

        final int value = 12;
        final int index = binarySearch(array, value);

        System.out.println(value  + " is at index: " + index);
    }

    private static int binarySearch(  final int[] array, final int value) {

        // Store the initial range of the search.
        int start = 0;
        int end = array.length - 1;

        // Loop until the range is zero.
        while (start <= end) {
       
            // Find the mid-point in the range.
            int middle = (start + end) / 2;

            // If the value is found at the
            // mid-point, return it.
            if (array[middle] == value)
                return middle;

            // Otherwise, cut the range in half
            // before looping.
            if (array[middle] < value)
                start = middle + 1;
            else
                end = middle - 1;
        }

        // Return -1 to indicate the
        // element was not found.
        return -1;
    }
	
}
