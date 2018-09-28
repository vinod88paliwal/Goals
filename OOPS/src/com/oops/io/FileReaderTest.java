package com.oops.io;

import java.io.*;

public class FileReaderTest {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("FileWriterTest.txt");
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);

		fr.close();
	}
}
