package com.finezoom.oops;

import java.util.Scanner;

class sumAndSubtract {
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of the value" + sum);
	}

	public void subtract(int a, int b) {
		int subtract = a - b;
		System.out.println("The subtract of the value" + subtract);
	}

	void display() {
		System.out.println("The Display");
	}
}

class multiplicationAndDivision extends sumAndSubtract {

	public void multiplication(int a, int b) {
		int multip = a * b;
		System.out.println("The multiplication of the value" + multip);
	}

	public void divide(int a, int b) {
		int divide = a / b;
		System.out.println("The divide of the value" + divide);

		super.display();

	}
}

public class arithmeticOperations {
	public static void main(String[] args) {
		multiplicationAndDivision crud = new multiplicationAndDivision();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = scan.nextInt();
		System.out.println("Enter the second value");
		int b = scan.nextInt();

		crud.sum(a, b);
		crud.subtract(a, b);
		crud.multiplication(a, b);
		crud.divide(a, b);
	}
}
