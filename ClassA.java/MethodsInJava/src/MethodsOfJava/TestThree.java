package MethodsOfJava;

public class TestThree {		//•	Calling Non static method
	public void demo() {		// inside another Non-static method
		System.out.println("demo is a non static method");
	}
	public void demo1() {
		demo();
	}
	public static void main (String[] args) {
	TestThree obj = new TestThree();
	obj.demo1();
	
	}
}
