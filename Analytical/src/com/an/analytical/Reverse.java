package com.an.analytical;

public class Reverse {

	public static void main(String[] args) {
		
		Reverse obj = new Reverse();
		
		String str ="Hello World";
		System.out.println(obj.revString(str));
		
		//Array reverse logic
		int arr[] = {1, 2, 3, 4, 5, 6};
		int len = arr.length;
		System.out.println("Length: "+len);
		
		obj.printArray(arr, len);
		
		obj.reverseArray(arr, 0, len-1);
		
		System.out.println("Reversed array is: ");
		obj.printArray(arr, len);
	}

	private String revString(String s) {

		if (s == null) {
			return null;
		} else {
			int len = s.length();

			if (len > 1) {

				char[] array = s.toCharArray();
				
				char tmp;
				for (int i = 0; i < len / 2; i++) {
					 tmp = array[i];
					array[i] = array[len - 1 - i];
					array[len - 1 - i] = tmp;
				}
				return new String(array);
			}
		}
			return s;
	}
	
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

}
