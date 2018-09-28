package com.collectios.basics;

public class EqualsClass {

	public static void main(String[] args) {
        String a = "hello";
        String b = null;
        
        System.out.println(a.equals(null)); //Correct Way
        
        System.out.println(b.equals(a)); //Wrong Way
        
	}
}
