package errors;

public class StackOverFlow {
	public void m1() {
		System.out.println("m1 is non static method");
		m2();
	}
	
	public  void m2() {
		System.out.println("m2 is non static method");
		
		m1();
	}
	public static void main(String[]args) {
		StackOverFlow obj = new StackOverFlow();
		obj.m1();
			
		
	}
}
