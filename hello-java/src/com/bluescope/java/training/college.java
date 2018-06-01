package com.bluescope.java.training;


interface clg{

	public String lect();
	
}
 
class lectures implements clg{
	
	public String lect() {
		return "This lecterer";
		
	}
}
class Students implements clg{
	
	public String lect() {
	
		return "Students";
	}
	public String demo() {
		
		return "Demo";
	}
}

public class college {
 public static void main(String args[]) {
	 clg cg =new lectures();
	System.out.println(cg.lect());
	clg c = new Students();
	System.out.println(c.lect());

	  }
}
