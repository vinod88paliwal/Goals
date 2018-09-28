package com.oops.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamReadWriteSongTest {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("RadheKrishnaDhun.mp3");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			FileOutputStream fout = new FileOutputStream("newSong.mp3");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int i;
			while ((i = bin.read()) != -1) {
				//System.out.println((byte) i);
				bout.write((byte)i);
				}
			bin.close();
			fin.close();
			fout.close();
			bout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
