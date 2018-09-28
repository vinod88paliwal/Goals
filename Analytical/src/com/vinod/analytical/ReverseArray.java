package com.vinod.analytical;

public class ReverseArray {
	
void reverseArray(int arr[], int start, int end)
{
  int temp;
  while(start < end)
  {
    temp = arr[start];  
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }  
}     
	
/* Utility that prints out an array on a line */
void printArray(int arr[], int size)
{
  int i;
  for (i=0; i < size; i++)
    System.out.print(" "+arr[i]);
  System.out.println();
} 

public static void main(String[] args) {
	
	ReverseArray obj = new ReverseArray();
	
	int arr[] = {1, 2, 3, 4, 5, 6};
	int len = arr.length;
	System.out.println("Length: "+len);
	
	obj.printArray(arr, len);
	
	  obj.reverseArray(arr, 0, len-1);
	
	  System.out.println("Reversed array is: ");
	  obj.printArray(arr, len);
	}

}
