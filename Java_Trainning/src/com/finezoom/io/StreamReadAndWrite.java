package com.finezoom.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamReadAndWrite {

	public static void main(String[] args) throws IOException {
		String content = streamReader();
		streamWritter(content);
	}

	private static void streamWritter(String content) {
		File file = new File("D:/Java-Trainning/trunk/StreamWriter.txt");
		// String content = "This is the text content";

		try (FileOutputStream fop = new FileOutputStream(file)) {

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String streamReader() throws FileNotFoundException, IOException {
		InputStream is = new FileInputStream("D:/Java-Trainning/trunk/teacher.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));

		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();

		while (line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}

		String fileAsString = sb.toString();
		System.out.println("Contents : " + fileAsString);
		buf.close();
		return fileAsString;
		
	}

}
