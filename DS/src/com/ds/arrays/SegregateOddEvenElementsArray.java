package com.ds.arrays;
//https://www.geeksforgeeks.org/segregate-even-and-odd-numbers/
public class SegregateOddEvenElementsArray {
	
	static void segregateEvenOdd(int arr[]) {
		int size = arr.length;
		int startIndex = 0;
		int endIndex = size - 1;

		while (startIndex < endIndex) {

			if (arr[startIndex] % 2 != 0 && arr[endIndex] % 2 == 0) {
				int temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
			}

			if (arr[endIndex] % 2 != 0) 
				endIndex--;

			if (arr[startIndex] % 2 == 0) 
				startIndex++;
		}

	}
	public static void main(String[] args) {

		int arr[] = {1, 3, 10, 9, 8, 90, 17};
		//int arr[] = {12, 34, 45, 9, 8, 90, 3};
		// int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
		 
        segregateEvenOdd(arr);// 12 10 10 45 2 10 9 45 
		 
        System.out.print("Array after segregation:  ");
        
        for(int i : arr)
        	System.out.print(i+" ");
	}
}

/*
 Time Complexity : O(n) 
 Auxiliary Complexity : O(1)
 
Algorithm: segregateEvenOdd()
1) Initialize two index variables left and right:  
            left = 0,  right = size -1 
2) Keep incrementing left index until we see an odd number.
3) Keep decrementing right index until we see an even number.
4) If lef < right then swap arr[left] and arr[right]
*/