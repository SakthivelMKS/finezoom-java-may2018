package com.finezoom.basics.basics;

import java.util.Scanner;

public class ByteProgram {
	//main method
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Byte value");
			//variable initialization
			byte bytevalue=scan.nextByte();
			
			System.out.println("bytevalue:"+bytevalue);
			scan.close();
	}

}
