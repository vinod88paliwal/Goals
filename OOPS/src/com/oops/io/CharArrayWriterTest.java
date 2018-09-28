package com.oops.io;
import java.io.*; 
public class CharArrayWriterTest {
	public static void main(String args[])throws Exception{  
		  
		  CharArrayWriter out=new CharArrayWriter();  
		  out.write("my name is Vinod Paliwal");  
		  
		  FileWriter f1=new FileWriter("a1.txt");  
		  FileWriter f2=new FileWriter("b1.txt");  
		  FileWriter f3=new FileWriter("c1.txt");  
		  FileWriter f4=new FileWriter("d1.txt");  
		  
		  out.writeTo(f1);  
		  out.writeTo(f2);  
		  out.writeTo(f3);  
		  out.writeTo(f4);  
		  
		  f1.close();  
		  f2.close();  
		  f3.close();  
		  f4.close();  
		 
		  System.out.println("Success....");
		 }  
}
