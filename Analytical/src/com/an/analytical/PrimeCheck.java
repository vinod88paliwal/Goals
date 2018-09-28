package com.an.analytical;

public class PrimeCheck {

	public static void main(String[] args) {
		
		//findPrimeNumber();
		findPrimeInArray(new int[] {5,4,1,3,7,8});
	}
	
	static void findPrimeNumber() {
		 int num = 17, i = 2;
		 boolean flag = true;
		 
		 if(num==0||num==1) { 
			   System.out.println(num+" is not prime number");   
			   return;
		 }
				   
		 while(i <= num/2) {
			
			// condition for non - prime number
			 if(num % i == 0) {
				 flag = false;
				 break;
			 }
			 i++;
		}//Loop ends here
		 
		 if(flag)
			 System.out.println(num + " is a prime number.");
	        else
	           System.out.println(num + " is not a prime number.");
	}
	
	
	static void findPrimeInArray(int [] a) {
		
		for(int i =0; i< a.length ; i++) {
			boolean flag = true;
			int j=2;
			 int num = a[i];
		
			 if(num==0||num==1)  
				   System.out.println(num+" is not prime number");   
			 else {		   
			 while(j <= num/2) {
				
				// condition for non - prime number
				 if(num % j == 0) {
					 flag = false;
					 break;
				 }
				 j++;
			}//Loop ends here
			 if(flag)
				 System.out.println(num + " is a prime number.");
			
			 }//else ends here
		}	 
	}
}
