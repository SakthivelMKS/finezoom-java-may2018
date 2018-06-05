package com.finezoom.array;

import java.util.Scanner;

public class ArrayGrid {
	//Main Method 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Varible Declaration
		int rowSize,columnSize;
		System.out.println("Enter The Array Row Size");
		rowSize=scan.nextInt();
		System.out.println("Enter The Column Size");
		columnSize=scan.nextInt();
		String[][] swampGrid = new String[rowSize][columnSize];
		//Two dimension array values are itrating 
		for (int row = 0; row < rowSize; row++)

		{   
			for (int column = 0; column < columnSize; column++)

			{
				swampGrid[row][column] = "- ";

				System.out.print(swampGrid[row][column]);
			}

			System.out.println();

		}

	}

}
