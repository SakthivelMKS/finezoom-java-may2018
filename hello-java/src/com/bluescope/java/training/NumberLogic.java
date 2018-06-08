package com.bluescope.java.training;

import java.util.Scanner;

public class NumberLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Assume any number from 1-100");
		System.out.println("you assume press 1 Confirmed");
		String value=scan.nextLine();
		System.out.println("Multiply that number in to two");
		System.out.println("Multiply that number press 2 Confirmed");
		String value2=scan.nextLine();
		System.out.println("add that number to 70");
		System.out.println("you added press 1 Confirmed");
		String value3=scan.nextLine();
	/*	System.out.println("subtract that number to 20");
		System.out.println("you subtract press 1 Confirmed");
		String value4=scan.nextLine();
		System.out.println("subtract that number to 30");
		System.out.println("you subtract press 1 Confirmed");
		String value5=scan.nextLine();
		System.out.println("subtract that number to 20");
		System.out.println("you subtract press 1 Confirmed");
		String value6=scan.nextLine();*/
		System.out.println("Enter That Number");
		int number=scan.nextInt();
		System.out.println("That Number is"+(number-70)/2);



	}

}
