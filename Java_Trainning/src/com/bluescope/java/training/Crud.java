package com.bluescope.java.training;

import java.util.Scanner;

public class Crud {

	public static void main(String[] args) {
	int fisrtValue,secondValue;
		Scanner ss=new Scanner(System.in);
		System.out.println(Constant.firstValue);
		fisrtValue=ss.nextInt();
		System.out.println(Constant.secondValue);
		secondValue=ss.nextInt();
		System.out.println(Constant.result);
		System.out.println(Constant.Sum+(fisrtValue+secondValue));
		System.out.println(Constant.Subtraction+(fisrtValue-secondValue));
		System.out.println(Constant.Multiplication+(fisrtValue*secondValue));
		System.out.println(Constant.Division+(fisrtValue/secondValue));
		ss.close();
	}

}
