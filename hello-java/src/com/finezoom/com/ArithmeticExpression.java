package com.finezoom.com;

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
System.out.println("Enter the two  value");
Scanner scan = new Scanner(System.in);
int firstValue,secondValue,total;
firstValue=scan.nextInt();
secondValue=scan.nextInt();
total=firstValue+secondValue;
System.out.println("The sum of value:"+total);
total=firstValue-secondValue;
System.out.println("The subtract of value:"+total);
total=firstValue*secondValue;
System.out.println("The Multiple of two value:"+total);
total=firstValue/secondValue;
System.out.println("The divide of the value:"+total);
total=firstValue%secondValue;
System.out.println("The remainder of the value:"+total);
	}

}
