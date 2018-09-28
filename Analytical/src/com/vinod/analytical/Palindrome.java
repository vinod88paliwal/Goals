package com.vinod.analytical;

public class Palindrome {

    public static void main(String args[]){
      
    	System.out.println(isPalindrome(1234321));
    	System.out.println(isPalindrome("ABCBAAQ"));
    }
    
    public static boolean isPalindrome(String s) {
    	
    	int len =s.length();
    	boolean f =true;
    	
    	for(int i=0 ; i < len/2 ; i++) {
    		
    		if(s.charAt(i) != s.charAt(len-1-i))
    			f = false;
    	}
    	
    	return f;
    }
    
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

    
    
    
    
}
