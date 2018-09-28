package com.oops.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamTest {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("f1.txt");
		FileOutputStream fout2 = new FileOutputStream("f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(5);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("success...");
	}
}
