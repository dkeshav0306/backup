package MethodsOfJava;

public class TestTow {				//•	Calling Non static method 
									//inside another static method
	public void demo() {
		System.out.println("demo is non static method");
	}
	public static void demo1() {
	TestTow	obj = new TestTow();
	obj.demo();
	}

	public static void main (String[] arge) {
		demo1();
	}
}