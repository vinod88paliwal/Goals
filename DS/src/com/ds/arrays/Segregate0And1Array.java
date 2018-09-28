package com.ds.arrays;
//https://www.cdn.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
public class Segregate0And1Array {

	public static void Segregate1and0(int array[], int n) {
		int start = 0, end = n - 1;
		while (start < end) {
			if (array[start] == 0) {
				start++;
				continue;
			}
			if (array[end] == 1) {
				end--;
				continue;
			}
			array[start++] = 0;
			array[end--] = 1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0 };
		Segregate1and0(arr, arr.length);
		
		for(int i : arr)
			System.out.print(i+" ");
		
	}
}
// Time Complexity: O(Log n)