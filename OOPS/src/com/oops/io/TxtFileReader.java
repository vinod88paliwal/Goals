package com.oops.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader {

	public static void main(String[] args) {

		// This will reference one line at a time
        String line = null;
        
		String fileName = "D:/STUDY/DATA/Interview/JavaGranth.txt";
		
        try {
			FileReader fileReader = new FileReader(fileName);
			
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            	while((line = bufferedReader.readLine()) != null) {
				    System.out.println(line);
				    //break;
            	}
            	 // Always close files.
                bufferedReader.close();	
                fileReader.close();
                
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}