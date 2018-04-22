package com.bluescope.java.training;

import java.util.Scanner;

public class DecesionMaking {

	public static void main(String[] args) {
		
		System.out.println("*****Example of If and If else");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter u r Age");
		int age;
		age=ss.nextInt();
		System.out.println("Example of If");
		if(age>30) {
			
			System.out.println("your older");
		}
		
		System.out.println("Example of If Else ");
		if(age<30) {
			
			System.out.println("your young");
		}else {
			System.out.println("your older");
		}
		System.out.println("Example of Nested If");
		if(age<20) {
			
			System.out.println("your stil Young ");
		}else if(age<40){
			System.out.println("your older");
		}
		else {
			System.out.println("your very  old");
		}
	}

}
