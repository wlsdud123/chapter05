package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneListApp {

	public static void main(String[] args) throws IOException {
		
		List<Person> pList = new ArrayList<Person>();
		
		Reader fr = new FileReader("C:\\javastudy\\file\\PhoneDB_원본.txt"); //불러오기
		BufferedReader br = new BufferedReader(fr); 
		
		Writer fw = new FileWriter("C:\\javastudy\\file\\PhoneDB_복사본.txt"); //추가
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();
			
			String[] info = str.split(",");
			Person pp = new Person(info[0], info[1], info[2]);
			pList.add(pp);
		}

		for(Person i : pList) {
			i.showInfo(); //d
		}
		
		bw.close();
	}

}
