package com.finezoom.basics.basics;

import java.util.Scanner;

public class ReversetheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String or Number you want");
		Scanner scan=new Scanner(System.in);
		String number=scan.nextLine();
		int numb=number.length();
		//one way
		for(int i=numb-1;i>=0;i--)
		{
		char letter=number.charAt(i);
		System.out.println(letter);
		}
		
		//another way
		int remainder,integerValue=Integer.valueOf(number);
		while(integerValue >0){
			remainder = integerValue % 10;
			integerValue = integerValue / 10;
			System.out.println(remainder);
		}
		scan.close();
	}

}
