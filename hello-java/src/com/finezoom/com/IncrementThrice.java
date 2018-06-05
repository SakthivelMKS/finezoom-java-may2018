
package com.finezoom.com;

import java.util.Scanner;

public class IncrementThrice {
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int value,sum=0;
		value = scan.nextInt();
		//Logic for Increment
		for (int i = 0; i <= 2; i++) {
			sum+=value;
			
		}
		System.out.println("The Increment Value is:" + sum);

	}

}
