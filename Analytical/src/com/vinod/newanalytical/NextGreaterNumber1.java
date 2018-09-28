package com.vinod.newanalytical;

import java.util.Arrays;

public class NextGreaterNumber1 {

	 // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    private void nextGreater(char[] arr, int n) {
        int i;

        // I) Start from the right most digit and find the first digit that is smaller than the digit next to it.

        for(i=n-1 ; i>0 ; i-- )
        {
            if(arr[i] > arr[i-1])
                break;
        }

        //If no such digit is found, then all digits are in descending order means there cannot be a greater number with same set of digits
        if (i == 0)
            System.out.println("Not possible");

        else
        {
            int x = arr[i-1], min = i;

            // II) Find the smallest digit on right side of (i-1)'th digit that is greater than number[i-1]
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] > x && arr[j] < arr[min])
                        min = j;
            }

        //III) Swap the above found smallest digit with number[i-1]
            swap(arr, i - 1, min);

        //IV) Sort the digits after (i-1) in ascending order
            Arrays.sort(arr, i, n);

            System.out.print("Next number with same set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i] +" ");
        }
    }
    // Utility function to swap two digit
    private void swap(char[] arr, int i, int min) {
        char temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    

    public static void main(String[] args) {

    	NextGreaterNumber1 obj = new NextGreaterNumber1();

    /*	int number = 1234;
		System.out.println("Input number is:        " + number);
    	
    	//int[] digits = getDigits(number);
		
		//If it is integer then convert it in char[] and rest will be same.
		char[] digits = Integer.toString(number).toCharArray();
		int size = digits.length;*/
    	
        char arr[] = { '5','3','4','9','7','6' };
        int size = arr.length;

        obj.nextGreater(arr,size);
    }
    
    
    
    private static int[] getDigits(int number) {

		int[] digitsArr = new int[String.valueOf(number).length()];

		int index = digitsArr.length - 1;
		while (number > 0) {
			digitsArr[index--] = number % 10;
			number = number / 10;
		}
		return digitsArr;
	}
}

/*
Following are few observations about the next greater number.
1) If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.
2) If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
3) For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)

You can now try developing an algorithm yourself.

Following is the algorithm for finding the next greater number.
I) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.

II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.

III) Swap the above found two digits, we get 536974 in above example.

IV) Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.
 */


/*
The above implementation can be optimized in following ways.
1) We can use binary search in step II instead of linear search.
2) In step IV, instead of doing simple sort, we can apply some clever technique to do it in linear time.
Hint: We know that all digits are linearly sorted in reverse order except one digit which was swapped.
 */

