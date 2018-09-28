package com.ds.sorting;

public class MyBubbleSort {

	public static void bubble_srt(int array[]) {
		int n = array.length;
		for (int m = n; m > 1; m--) {
			for (int i = 0; i < n - 1; i++) {

				if (array[i] > array[i + 1]) {

					int temp;
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

				}
			}
			printNumbers(array);
		}
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int[] input = { 3, 8, 4, 9, 11, 5, 99, 2, 6 };
		bubble_srt(input);

	}
}