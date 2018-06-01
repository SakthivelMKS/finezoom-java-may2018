package com.bluescope.java.training;



class teacher{
	
	public void teacher() {
		System.out.println("This is teacher ");
	}
	
}

class student extends teacher{
	public void student() {
	System.out.println("This is student");
	}
}

public class school {
	public static void main (String args[]) {
		student st =new student();
		st.student();
		st.teacher();
		System.out.println("This is Main class");
	}
	

}
