package com.finezoom.com;

import java.util.Scanner;

public class DecrementThrice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for decrement");
		//System.out.println("Enter the value for how many time decrement");

		
		int value,incremntSize,sum=0;
		value = scan.nextInt();
		//incremntSize= scan.nextInt();
		
		for (int i = 0; i <= 2; i++) {
			sum=sum-value;
			
		}
		System.out.println("The Increment Value is:" + sum);

	}

}
