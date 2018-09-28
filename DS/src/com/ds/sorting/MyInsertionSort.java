package com.ds.sorting;

public class MyInsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {10,34,2,56,7,67,88,42};

		int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
            	
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
		
		for(int i:arr){
            System.out.print(i);
            System.out.print(", ");
        }
	}
	
}
