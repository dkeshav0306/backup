package constructor1;

public class Con1 {
	public void m1() {
		System.out.println("m1 is non static method");
	}
	
	public void m2() {
		System.out.println("m2 is non static method");
	}
	
	public Con1() {
	
		System.out.println("constructor 1 of Con1 class");
	}

	public Con1(boolean a) {
		this();
		System.out.println("constructor 2 of Con1 class");
	}
	
	public Con1(int a) {
		this(true);
		System.out.println("constructor 3 of Con1 class");
	}
	/*public static void main(String[]args) {
		new Con1();
	}*/
}


