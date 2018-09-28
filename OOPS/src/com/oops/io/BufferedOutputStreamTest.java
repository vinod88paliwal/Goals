package com.oops.io;
import java.io.*;
public class BufferedOutputStreamTest {

	public static void main(String args[]) throws Exception {

		FileOutputStream fout = new FileOutputStream("BufferedOutputStreamTest.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String s = "Sachin is my favourite player";
		byte b[] = s.getBytes();
		bout.write(b);

	// bout.flush();
		bout.close();
		fout.close();
		System.out.println("success....");
	}
}
