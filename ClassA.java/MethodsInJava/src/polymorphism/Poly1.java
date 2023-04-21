package polymorphism;

public class Poly1 {
	// overloading method in same class.
	public void k1() {
	System.out.println("k1 is overloding method");
	}
	
	public void k1(int a) {
		System.out.println("k1 is int argument from parrent class");
	}
	
	public void k1(int a,int b) {
		System.out.println("k1 is double int argument from parrent class");
	}
	public static void main(String[] args) {
		Poly1 obj = new Poly1();
		obj.k1();
		obj.k1(0);
		obj.k1(0, 0);
	}

}
