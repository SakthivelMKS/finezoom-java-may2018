package com.finezoom.basics.basics;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array size");
		
		int index=0,count=0,arraysize=scan.nextInt();
		String stringArray[]=new String[arraysize],indexValue;
		for(int i=0;i<stringArray.length;i++)
		{ 
			count++;
			System.out.println("Enter the"+count+ "index value");
			stringArray[i]=scan.next();
		}
		System.out.println("Enter the Value for finding index");
		indexValue=scan.next();
		int[] matchValue = null;
		for( int i = 0 ; i < stringArray.length ; i++ ) {
			for(String stringvalue:stringArray) {
				index++;
            if( stringvalue.equals(indexValue)) { 
            	
                 System.out.println("The index of the value"+index);
                 matchValue=new int[] {index};
            }
			}
		}
            for(int indexs:matchValue) {
            	System.out.println("The Given Value occured"  +indexValue+  "following index:"+indexs);
            }
		
            scan.close();
	}
	}

