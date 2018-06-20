package com.finezoom.basics;


import java.util.Scanner;

public class InvalidValueToTheVriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan =new Scanner(System.in);
      //Variable initialization
      float floatValue;
      int intValue;
      System.out.println("Enter the Float value");
      //Value assign to the variable
      floatValue=scan.nextFloat();
	  intValue=scan.nextInt();
     
      System.out.println(floatValue);
      System.out.println(intValue);
      scan.close();
      
	}

}
