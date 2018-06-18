package com.finezoom.array;

import java.util.Scanner;

public class ArrayContain0and1 {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the array size");
			int position = 0, arraySize = scan.nextInt();
			Boolean success=false;
			int array[] = new int[arraySize];
			for (int i = 0; i < arraySize; i++) {
				position++;
				System.out.println("Please enter the " + position + " String");
				array[i] = scan.nextInt();
				scan.close();
			}
			for (int value : array) {
				if((value==-1)||(value==0)) {
					success=true;
				}
				
			}
			
			if(success) {
				System.out.println("The Array Contain -1 and 0");
			}else {
				System.out.println("The Array does not Contain -1 and 0");
			}
	}

}
