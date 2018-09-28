package com.vinod.newanalytical;

public class ArrayMaxOrMinElementSelection {

private static void smallest(int[] arr){
		
	 int smallest =arr[0];
	 
		for(int i : arr) {
			
			if(i < smallest)
				smallest =i;
		}
	
		System.out.println("The smallest element is "+smallest);
	}

	private static void secondSmallest(int[] arr){
		
		int first , second;

		if(arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		}
		else {
			first = arr[1];
			second = arr[0];
		}
		
		
		for(int i : arr) {
	/* If current element is smaller than first then update both first and second */	
			if(i < first) {
				second = first;
				first = i;
			}
	/* If arr[i] is in between first and second then update second  */	
			else if( i< second && i != first) 
				second =i;
		}
		if (second == Integer.MAX_VALUE)
            System.out.println("There is no second smallest element");
                              
		else
			System.out.println("The smallest element is " + first + " and second Smallest  element is " + second);
	}
	
	
	private static void thirdSmallest(int[] arr) {
		
		int first = arr[0];
		int second = arr[1];
		int third = arr[2];
		
		for(int i : arr) {

	/* If current element is smaller than first then update all 3 first, second and three */				
			if(i < first) {
				third = second;
				second = first;
				first = i;
			}
    /* Check if current element is less than second then update second and third */		
			else if(i < second && i != first) {
				third = second;
				second = i;
			}
			/* Check if current element is less than then update third */
			else if(i < third && i != first && i != second)
				third =i;
		}
	System.out.println("The smallest: "+first+ " , second Smallest: "+second+" and Third Smallest : "+third);
		
	}
	
	
	private static void maximum(int[] arr){
		
		 int maximum =arr[0];
		 
			for(int i : arr) {
				if(i > maximum)
					maximum =i;
			}
			System.out.println("The maximum element is "+maximum);
		}

	private static void secondMax(int[] arr){
		
		int first = arr[0];
		int second = arr[1];
		
		for(int i : arr) {
	/* If current element is smaller than first then update both first and second */	
			if(i > first) {
				second = first;
				first = i;
			}
	/* If arr[i] is in between first and second then update second  */	
			else if( i> second && i != first) 
				second =i;
			
		}
			System.out.println("The maximum element is " + first + " and second max  element is " + second);
	}
	
	private static void thirddMax(int[] arr){
		
		int first = arr[0];
		int second = arr[1];
		int third = arr[2];
		
		for(int i : arr) {
	/* If current element is greater than first then update both first and second */	
			if(i > first) {
				third =second;
				second = first;
				first = i;
			}
	/* If arr[i] is in between first and second then update second  */	
			else if( i> second && i != first) {
				third =second;
				second =i;
			}
	/* If arr[i] is in between second then update second  */				
			else if (i> third && i != first && i != second)
				third = i;
		}

			System.out.println("The maximum element are First: "+ first + " , second: "+ second+" and Third : "+third);
	}
	
	public static void main(String[] args) {
		
		//int[] arr = new int[]{4,2,3,1,5,1,2,4};
		   int arr[] = {0,3,5,7,9,44};
      //  smallest(arr);
        //secondSmallest(arr);
       // thirdSmallest(arr);
        
		//maximum(arr);
		//secondMax(arr);
		thirddMax(arr);
		
	}


	
}
