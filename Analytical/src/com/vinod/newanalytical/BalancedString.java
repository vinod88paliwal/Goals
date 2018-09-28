package com.vinod.newanalytical;

import java.util.Stack;

public class BalancedString {
	
	public static void main(String[] args) {

//		System.out.println(isBalancedString("(as{ asdfasdf[asdfas]d} f)")); 
		System.out.println(isBalancedString("(a[b]c)")); 
		System.out.println(isBalancedString("(a[a{cb]c}c)")); 
		
	}
	
	
	public static boolean isBalancedString(String S){
		Stack<Character> Q = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			char x = S.charAt(i);
			if( x == '(' || x == '[' ||x == '{') {
				Q.add(x);
				continue;
			}
			
			else if (x == ')' && Q.pop() != '(') {
				return false;
			
			}else if(x == ']' && Q.pop() != '['){
				return false;
			
			}else if(x == '}' && Q.pop() != '{'){
				return false;
			}
		}

		return true;
	}
	
}
