package com.oops.io;

import java.io.*;

public class FileWriterTest {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("FileWriterTest.txt");
			fw.write("my name is sachin");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
	}
}
