package com.finezoom.basics.basics;

import java.util.Scanner;

public class DecrementThrice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for decrement");
		//System.out.println("Enter the value for how many time decrement");
		int value,subtract=0;
		value = scan.nextInt();
		subtract=value-value;
		subtract=subtract-value;
		subtract=subtract-value;
		System.out.println("The Increment Value is:" + subtract);
		scan.close();

	}

}
