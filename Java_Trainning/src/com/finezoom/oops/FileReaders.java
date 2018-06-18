package com.finezoom.oops;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaders {	
	
	public static void main(String args[]) throws FileNotFoundException {
		
		String data[] = null;
		
		FileReader fr =new FileReader("D:/Java-Trainning/trunk/teacher.txt");
		BufferedReader br =new BufferedReader(fr);
	try {
		
		String line=br.readLine();
     while(line!=null) {
    	  data= line.split(",");
    	line= br.readLine();
    	System.out.println(line);
    	  
     }
     for (int i = 0; i < data.length; i++) {
		String string = data[i];
		System.out.println(string);
		
	}
 	br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
		
}


}
	


 