package com.finezoom.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException {
		String readedConent =fileReading();
		fileWriting(readedConent); 
	}

	private static void fileWriting(String readedConent) {
		try {
			FileWriter fw =new FileWriter("D:/Java-Trainning/trunk/writer.txt");
			@SuppressWarnings("resource")
			BufferedWriter bw =new BufferedWriter(fw);
			//while(readedConent!=null){
			bw.write("Hi this is sakthi");
			bw.flush();
			//}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static String fileReading() throws FileNotFoundException {
		FileReader fr = new FileReader("D:/Java-Trainning/trunk/teacher.txt");
	
		BufferedReader br =new BufferedReader(fr);
	String line=null;
		try {
		line = br.readLine();
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return line;
	}

}
