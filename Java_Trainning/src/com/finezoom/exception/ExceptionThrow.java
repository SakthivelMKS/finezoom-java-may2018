package com.finezoom.exception;

import java.util.Scanner;

public class ExceptionThrow {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a");
		try {
		int a =scan.nextInt();
			int c=a/0;		
			System.out.println(c);
		}catch(Exception e)
		{
		      System.out.println("Exception e"+e); 
		}
		finally {
			
		}
	}

}
