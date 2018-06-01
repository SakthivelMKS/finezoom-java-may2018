package com.finezoom.com;

import java.util.Scanner;
class BodMass
{
	//main method
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight in kgs and height in cm");
		//variabale declare for getting weight &height
		float weight,height,bodMass;
		//value are assign to the variabale
		weight=scan.nextFloat();
		height=scan.nextFloat();
		//Logic for finding BodMass
		bodMass=(100*100*weight)/(height*height);
		//Bmi based split the catagory
			if(bodMass<18.5){
			System.out.println("Underweight"+bodMass);
			}else if(bodMass<25){
			System.out.println("Normal weight"+bodMass);
			}
			else if(bodMass<30){
			System.out.println("Overweight"+bodMass);
			}else{
			System.out.println("Obesity"+bodMass);
			}
    }
}
  