package com.oops.array;

public class AdditioninArrayUsingRecursion {

	String s =null;
	public static int array( int[] arr, int first, int last)
    {
        if(arr[first] == arr[last])/* must be if(first == last),but try this one too, study the code, it is interesting */
        {
           return arr[first];
        }
        else
        { 
           return arr[first] + array(arr, first+1, last);
        }
    }

	public static void main(String[] args)
    {
        int[] numArr = {4,5,7,8,1,6,4,9};
 
        System.out.print("The sum of the numbers is: "+  array(numArr, 0 , numArr.length-1) );
    }
}