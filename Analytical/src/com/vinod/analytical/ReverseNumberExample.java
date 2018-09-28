package com.vinod.analytical;

import java.util.Scanner;

/**
 * Simple Java program to reverse a number in Java using loop and operator
 * This program also shows example of using division operator(/) and Remainder Operator(%)
 */
public class ReverseNumberExample {

    public static void main(String args[]) {
       //input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();
     
        int reverse = reverse(number);
        System.out.println("Reverse of number " + number + " is " + reverse(number));  
    }
 
    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
        int reverse = 0, sum=0;
        int temp = 0;
        while(number > 0){
            
              temp = number%10;
              System.out.println(temp);
        	  reverse = reverse * 10 + temp;
              number = number/10;
        	
        	//sum = sum+temp; //If also wants sum
           }
        return reverse;
    }

}
