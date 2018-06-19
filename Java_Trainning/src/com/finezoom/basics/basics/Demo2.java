package com.finezoom.basics.basics;

import com.finezoom.basics.oops.Demo;
import com.finezoom.basics.oops.DemoAbstract;

public class Demo2 extends DemoAbstract {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DemoAbstract db =new DemoAbstract();

		Demo demo = new Demo();
		demo.add();
		int value=demo.avergae(3, 8);
		System.out.println(value);
		//demo.mutliple();//This metod is declare access specifiers protected so we can't access
		demo.subtract();
		demo.divide();
		int remainder=demo.remainder(99);
		System.out.println(remainder);
		
	}
	
	@Override
	public void add() {
		boolean valid = true;

		if (valid) {
			System.out.println("valid ");
			mutliple();

		}

	}

	@Override
	public int remainder(int number) {
		// TODO Auto-generated method stub
		int result=number%2;
		int quotient=number/2;
		return result+quotient;
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void subtract(){
		
	}
	
	@Override
	public void divide(){
		
	}*/

	

	

	

}
