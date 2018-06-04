package com.finezoom.com;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		int givenvalue;
		String letter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter for print");
		System.out.println("Enter the size for the pyramid");
		letter = scan.nextLine();
		givenvalue = scan.nextInt();
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

	}
}
