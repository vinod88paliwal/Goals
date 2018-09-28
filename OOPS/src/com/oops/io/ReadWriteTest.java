package com.oops.io;

import java.io.*;

public class ReadWriteTest {
	public static void main(String args[]) throws Exception {
			FileInputStream fin = 
				new FileInputStream("D:/WORK/BasicOfJava/Basics/src/com/basics/io/ReadWriteTest.java");
		FileOutputStream fout = new FileOutputStream("M.java");
		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write((byte) i);
		}
		fin.close();
		System.out.println("Written Successfully ..!!!!!");
	}
}
