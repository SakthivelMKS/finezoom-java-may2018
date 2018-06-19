package com.finezoom.basics.exception;

import java.util.Scanner;

public class ExceptionsThrows {

	public static void main(String[] args) {

		try {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the value");
			int a=scan.nextInt();
			//Method Calling 
			ExceptionUtil.divison(a);
			scan.close();
		} catch (Exception e) {
			//Catching 
			System.out.println("Exception getting: " + e);
		}
	}
}