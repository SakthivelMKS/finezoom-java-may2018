package com.finezoom.basics.oops;

public abstract class DemoAbstract implements DemoInterface{


	public  void add() {
		// TODO Auto-generated method stubso
		System.out.println("This add Method");
		
	}
	@Override
	public  void subtract(){
		System.out.println("subtract");
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		System.out.println("divide");
	}
	
	protected void mutliple(){
		System.out.println("mutliple");
	}
	
	public  int avergae(int a,int b){
		System.out.println("sakthi");
		int result = a + b;// TODO Auto-generated method stub
		return result;
		
	}
		
	public   int remainder(int number)
	{
		
		int result=number/2;
		System.out.println("The Result in super class or parent class"+result);
		return result;
	}

}
