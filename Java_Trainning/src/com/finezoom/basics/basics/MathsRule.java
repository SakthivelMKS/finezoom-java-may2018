package com.finezoom.basics.basics;


import java.util.Scanner;

public class MathsRule {
	//main method
	public static void main(String[] args) {
		//variable Declarations
			int a,b,result,number;
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the a Value");
			System.out.println("Enter the b Value");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Which way u continue If manual press '1' or math function press '2'");
			number =scan.nextInt();
			//swithcase
			
				switch(number){
				//Logic For Manual way
					case(1):{
						result=((a*a*a*a*a)+(2*a*b)+(b*b*b*b*b*b*b*b*b*b*b*b));
						System.out.println("The value:"+result);
						break;
							}
					
					case(2):{
						//Logic For Math way
						Double results=((Math.pow(a, 5))+(2*a*b)+(Math.pow(b, 12)));
						result=(int) Math.round(results);
						System.out.println("The value:"+result);
						break;
							}
					
						default:{
							System.out.println("Your enter Invaild Number");
							}
				}
				scan.close();
		
		}

	}
	


