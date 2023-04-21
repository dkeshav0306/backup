package polymorphism;

public class Poly2 extends Poly1 {
	// overloading method in different class in same package .
	public void k1(boolean a) {
		System.out.println("k1 is boolean argument from child poly2");
	}
	
	public void k1(boolean a, int b) { 
		System.out.println("k1 is boolean and int argyment from child poly2");
	}
	
	public static void main(String[] args) {
		Poly2 obj = new Poly2();
		obj.k1();
		obj.k1(0);
		obj.k1(0, 0);
		obj.k1(false);
		obj.k1(false, 0);
		System.out.println();
		
		Poly1 obj1 = new Poly2();
		obj1.k1();
		obj1.k1(0);
		obj1.k1(0, 0);
		System.out.println();
		
		Poly2 obj3 = new Poly2();
		obj3.k1(false);
		obj3.k1(false, 0);
		System.out.println();
	}
}
