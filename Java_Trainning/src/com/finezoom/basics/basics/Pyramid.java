package com.finezoom.basics.basics;

import java.util.Scanner;

public class Pyramid {
	//Main method
	public static void main(String[] args) {
		//Variable Declarations
		int givenvalue;
		String letter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter for print");
		System.out.println("Enter the size for the pyramid");
		letter = scan.nextLine();
		givenvalue = scan.nextInt();
		//Logic for handling pyramid
		for (int i = 1; i <= givenvalue; i = i + 2) {
			int spaceCount = (givenvalue - i) / 2; 

			for (int j = 0; j < givenvalue; j++) {
				if (j < spaceCount || j >= (givenvalue - spaceCount)) {
					System.out.print(" "); 

				} else {
					System.out.print(letter);
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
