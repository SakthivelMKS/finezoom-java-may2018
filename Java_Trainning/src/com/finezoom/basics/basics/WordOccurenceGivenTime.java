package com.finezoom.basics.basics;

import java.util.Scanner;

public class WordOccurenceGivenTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Words Given Time");
		//Variable initialization
		String letter, words;
		int count = 0;
		System.out.println("Enter the letter for counting");
		//values are assign  to the varibles
		words = scan.nextLine();
		letter = scan.nextLine();
	
		char value, lett = letter.charAt(0);
		//validations for given words occurences 
		for (int i = 0; i < words.length(); i++) {
			value = words.charAt(i);
			if (value == lett) {
				count++;
				// System.out.println("The given word "+lett+" following
				// "+count+" times");

			}
		}
		System.out.println("The given letter " + lett + " following " + count + " times");
		scan.close();
	}

}
