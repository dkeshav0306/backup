package constructor;

public class Constructor {
	public Constructor(int a ,int b, int c) {
		this(5);
		System.out.println("i am constructor");
	}
	public Constructor(int a) {
		this(5,5);
		System.out.println("Constructor with int a argument ");
	}
	
	public Constructor(int a, int b) {
		this(true);
		System.out.println(" Constructor with int a and b agument");
	}
	
	public Constructor(boolean a) {
		System.out.println("Constructor with boolean a argyment");
	}
	public static void main(String[]args) {
		new Constructor(1, 2, 3);
	}
}
