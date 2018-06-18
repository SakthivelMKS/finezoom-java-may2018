package com.bluescope.java.training;



class teacher{
	
	public teacher() {
		System.out.println("This is teacher ");
	}
	
}

class student extends teacher{
	public student() {
	System.out.println("This is student");
	}



	public void teacher() {
		// TODO Auto-generated method stub
		
	}
}

public class school {
	public static void main (String args[]) {
		student st =new student();

		st.teacher();
		System.out.println("This is Main class");
	}
	

}
