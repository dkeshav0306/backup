package constructor1;

public class Con2 extends Con1 {
	public void m5() {
		System.out.println("m5 is non static method");
	}
	
	public void m6() {
		System.out.println("m6 is non static method");
	}
	
	public Con2() {
		this(5,5);
		System.out.println("constructor 1 of con2 class");
	}
	
	public Con2(int a , int b) {
		this(4);
		System.out.println("constructor 2 of con2 class");
	}
	
	public Con2(int a) {
		super(2);
		System.out.println("constructor 3 of con2 class");
	}
}
