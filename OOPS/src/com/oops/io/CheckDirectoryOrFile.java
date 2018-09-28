package com.oops.io;

import java.io.File;

public class CheckDirectoryOrFile {
 
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vinod Paliwal\\file.txt");
        File dir = new File("C:\\Users\\Vinod Paliwal");
        File notExists = new File("C:\\Users\\Vinod Paliwal\\notafile");
         
        System.out.println("C:\\Users\\Vinod Paliwal\\file.txt is file? "+file.isFile());
        System.out.println("C:\\Users\\Vinod Paliwal\\file.txt is directory? "+file.isDirectory());
         
        System.out.println("C:\\Users\\Vinod Paliwal is file? "+dir.isFile());
        System.out.println("C:\\Users\\Vinod Paliwal is directory? "+dir.isDirectory());
         
        System.out.println("C:\\Users\\Vinod Paliwal\\notafile is file? "+notExists.isFile());
        System.out.println("C:\\Users\\Vinod Paliwal\\notafile is directory? "+notExists.isDirectory());
    }
 
}