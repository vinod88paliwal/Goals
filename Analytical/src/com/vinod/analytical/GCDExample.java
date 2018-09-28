package com.vinod.analytical;

import java.util.Scanner;

/**
 * Java program to demonstrate How to find Greatest Common Divisor or GCD of 
 * two numbers using Euclid’s method. There are other methods as well to 
 * find GCD of two number in Java but this example of finding GCD of two number
 * is most simple.
 *
 * @author Javin Paul
 */
public class GCDExample {
 
 
    public static void main(String args[]){
     
        //Enter two number whose GCD needs to be calculated.     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
     
System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
    }
    /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
 
}
