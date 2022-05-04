package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
	
			InputStream in = new FileInputStream("C:\\Users\\user\\Downloads\\img.jpg");
			OutputStream out = new FileOutputStream("C:\\Users\\user\\Downloads\\byteImg.jpg");
			
			while(true) {
				int data = in.read();
				System.out.println(data);
				if(data == -1) {
					break;
				}
				
			}

			
			out.close();
			in.close();
	}

}
