package com.ds.arrays;

public class PositiveAtEvenNegativeAtOddPositions {

	static void arrangePositiveEvenNegativeOdd(int[] arr , int len) {
	
		int pos_num = 0;
		int neg_num = 0;
		
		for (int i = 0; i < len; i++)
			if (arr[i] > 0)
				pos_num++;
			else
				neg_num++;
		
		int count = (pos_num < neg_num) ? pos_num : neg_num;
		boolean isPos = (pos_num < neg_num) ? true : false;
	
		int i = 0;
		int index = 0;
		while (i < count && index < len) {
			
			if (index % 2 == 0) {
				if (arr[index] < 0) {
					int position = index + 1;
					while (arr[position] < 0 && position < len)
						position++;
					while (position > index) {
						int temp = arr[position];
						arr[position] = arr[position - 1];
						arr[position - 1] = temp;
						position--;
					}
				}
				index++;
				if (isPos)
					i++;
			} else {
				if (arr[index] > 0) {
					int position = index + 1;
					while (arr[position] > 0 && position < len)
						position++;
					while (position > index) {
						int temp = arr[position];
						arr[position] = arr[position - 1];
						arr[position - 1] = temp;
						position--;
					}
				}
				index++;
				if (!isPos)
					i++;
			}
		}
	}
	
	public static void main(String[] args) {

	//	int arr[] = {1, -3, 5, 0, -3, 6, 7, -4, 9, 10};
		int arr[] =	{-1, -2, -3, -4, -5, 6, 7, 8};
	    int n = arr.length;
	 
	    arrangePositiveEvenNegativeOdd(arr, n);
	   // change(arr,n);
	    for (int i = 0; i < n; i++)
	    System.out.print(arr[i] + " ");
	}
	}
