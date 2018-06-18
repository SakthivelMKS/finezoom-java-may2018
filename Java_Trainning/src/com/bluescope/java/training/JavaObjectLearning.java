package com.bluescope.java.training;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaObjectLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excute jj =new excute();
		System.out.println("Enter the two values:");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	ArrayList dom=	jj.bookDetails1(a,b);
	
	for(Object values: dom)
	System.out.println(values);
	}

}
