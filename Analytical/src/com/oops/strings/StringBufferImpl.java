package com.oops.strings;

public class StringBufferImpl {

	private char[] buffer;
	private int capacity;
	private int length;
	
	public StringBufferImpl() {
		buffer = new char[16];
	}
			
	public StringBufferImpl(int cap) {
		this.capacity = cap;
		this.length = 0;
	}
	
	public StringBufferImpl(String str) {
		this.capacity = str.length() + 16;
		buffer = new char[capacity];
		append(str);
	}
	
	public synchronized StringBufferImpl append(String str)
	{
		String s = str;
		
		if(s == null) s = "null";
		//
		if(length + s.length() > capacity)
		{
			int len = Math.max(length + s.length(), capacity *2);
			char[] arr = new char[len];
			
			for(int i=0; i <length ; i++)
					arr[i] = buffer[i];
			
			buffer = arr;
			capacity = len;
		}
		
		for(int i=0; i< s.length(); i++)
			buffer[length + i] = s.charAt(i);
		
		length += s.length();
		
		return this;
	}
	
	@Override
	public String toString() {
		return new String(buffer);
	}
	
	public static void main(String[] args) {

		StringBufferImpl sbi = new StringBufferImpl("My ");
		
		sbi.append("Hello ");
		sbi.append("World!! ");
		
		System.out.println(sbi.toString());
	}
}









