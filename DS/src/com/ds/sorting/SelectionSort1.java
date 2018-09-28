package com.ds.sorting;

public class SelectionSort1 {
	public static void main(String[] args) {
		
		int [] arr = {4,2,6,8,9,0,1,7,5};
		
		int min,temp;
		
		for(int i=0; i<arr.length-1; i++){
			min=i;
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
