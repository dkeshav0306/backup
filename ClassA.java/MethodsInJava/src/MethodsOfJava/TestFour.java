package MethodsOfJava;

public class TestFour {			//Calling static method inside 
								//another Non static method 

	public static void m1() {
		System.out.println("m1 is a static method");
	}
	
	public void m2() {
		m1();
	}
	public static void main(String[]args) {
		TestFour obj=new TestFour();
		obj.m2();
	}
}

