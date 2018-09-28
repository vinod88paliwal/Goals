package com.vinod.newanalytical;

import java.util.Stack;

public class BalancedString {
	
	public static void main(String[] args) {

//		System.out.println(isBalancedString("(as{ asdfasdf[asdfas]d} f)")); 
		System.out.println(isBalancedString("(a[b]c)")); 
		System.out.println(isBalancedString("(a[a{cb]c}c)")); 
		
	}
	
	
	public static boolean isBalancedString(String s){
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( c == '(' || c == '[' ||c == '{') {
				stack.add(c);
				continue;
			}
			
			else if (c == ')' && stack.pop() != '(') {
				return false;
			
			}else if(c == ']' && stack.pop() != '['){
				return false;
			
			}else if(c == '}' && stack.pop() != '{'){
				return false;
			}
		}

		return true;
	}
	
}
