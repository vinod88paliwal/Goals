package com.oops.strings;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(null); //java.lang.NullPointerException at Line 6
		System.out.println(sb);
		
		sb.append("Hello");
		
		/*
		StringBuilder sb1 = new StringBuilder(null); //java.lang.NullPointerException at Line 10
		System.out.println(sb1);*/
	}
	
	
}
