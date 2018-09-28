package com.an.analytical;

public class SwappingWIthoutThirdVariable {

	public static void main(String[] args) 
	{
		getSwappedWithoutTempVariable(10,20);
		getSwappedUsingBitwise(2,4);
		usingMultiplicationAndDivision(6,3);
	
/*
A       B       A^B (A XOR B)
0       0       0 (zero because operands are same)
0       1       1
1       0       1 (one because operands are different)
1       1       0

int a = 2; //0010 in binary
int b = 4; //0100 in binary

		 */
	}
	
	
static void getSwappedWithoutTempVariable(int a, int b)
{
	 System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
	 //swapping value of two numbers without using temp variable
	 a = a+ b; //now a is 30 and b is 20
	 b = a -b; //now a is 30 but b is 10 (original value of a)
	 a = a -b; //now a is 20 and b is 10, numbers are swapped

	 System.out.println("value of a and b after swapping, a: " + a +" b: " + b);
}
	
 static void getSwappedUsingBitwise(int a, int b)
 {
	 System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
     //swapping value of two numbers without using temp variable and XOR bitwise operator     
	a = a^b; //now a is 6 and b is 4
	b = a^b; //now a is 6 but b is 2 (original value of a)
	a = a^b; //now a is 4 and b is 2, numbers are swapped
	      
	System.out.println("value of a and b after swapping using XOR bitwise operation, a: " + a +" b: " + b);
 }

 static void usingMultiplicationAndDivision(int a, int b)
 {	
	 System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
	 //swapping value of two numbers without using temp variable using multiplication and division
	 a = a*b; //now a is 18 and b is 3
	 b = a/b; //now a is 18 but b is 6 (original value of a)
	 a = a/b; //now a is 3 and b is 6, numbers are swapped

	 System.out.println("value of a and b after swapping using multiplication and division, a: " + a +" b: " + b);

 	
 }
}