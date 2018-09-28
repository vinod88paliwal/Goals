package com.ds.arrays;

/*
Time complexity : O(n)
Auxiliary Space : O(1)
*/
public class RotateArray {

	 void reverseArray(int[] arr, int lIndex, int rIndex) {
	        int temp;
	        for (; lIndex < rIndex; lIndex++, rIndex--) {
	            temp = arr[lIndex];
	            arr[lIndex] = arr[rIndex];
	            arr[rIndex] = temp;
	        }
	    }

	    void leftRotate(int[] arr, int d, int size) {
	        reverseArray(arr, 0, d - 1);
	        reverseArray(arr, d, size - 1);
	        reverseArray(arr, 0, size - 1);
	    }

	    public static void main(String[] args) {
	        RotateArray obj = new RotateArray();

	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        obj.leftRotate(arr, 2, arr.length);
	        obj.printArray(arr);

	    }

	    private void printArray(int[] arr) {
	        for (int i : arr)
	            System.out.println(i + " ");
	    }
	}