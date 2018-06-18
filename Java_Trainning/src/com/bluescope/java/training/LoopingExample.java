package com.bluescope.java.training;

import java.util.Scanner;

public class LoopingExample {

	public static void main(String[] args) {
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The loop u want 'while','dowhile','for'");
		String key;
		key=sc.nextLine();
		switch(key){
		
		case("while"):
		System.out.println("Enter the value lesser then 10");
		a=sc.nextInt();
		while(a <= 20) {
			System.out.println("the value of a:"+a);
			//The value is increase Every time insid ethe loop
			a++;
			System.out.println("The value after increase:"+a);
		}
		break;
		
		case("do"):
			System.out.println("Enter the value lesser then 10");
	
			a=sc.nextInt();
			do{
				System.out.println("the value of a:"+a);
				//The value is increase Every time insid ethe loop
				a++;
				System.out.println("The value after increase:"+a);
			}while(a <= 20); 
			break;
			
		case("for"):
			System.out.println("Enter the value lesser then 10");
	
			a=sc.nextInt();
			for(;a<20;a++){
				System.out.println("the value of a:"+a);
				//The value is increase Every time insid ethe loop
				
			}
			break;
		}
	}

}
