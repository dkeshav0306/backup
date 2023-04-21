package polymorphism2;

import polymorphism.Poly1;
import polymorphism.Poly2;

public class Poly3 extends Poly2 {
	public void k1(int a, int b, int c) {
		System.out.println("k1 is 3 int argument from child poly3");
	}
	
	public void k1(int a, boolean b, int c  ) {
		System.out.println("k1 is 3 int boolean int argument from child poly3");
	}

	public static void main(String[] args) {
		Poly1 obj1 =new Poly3();
		System.out.println("This is method of parrent Poly1 from different package calling in child poly3 calss:");
		obj1.k1();
		obj1.k1(0);
		obj1.k1(0, 0);
		
	
	System.out.println("\nThis is method of parrent Poly2 from different package calling in child poly3 calss:");
		Poly2 obj2=new Poly3();
		obj2.k1();
		obj2.k1(1);
		obj2.k1(1,1);
		
		obj2.k1(true);
		obj2.k1(true,1);
		
		System.out.println("\nThis is child class poly3 calls different methods of parrent class:");
		Poly3 obj3= new Poly3();
		obj3.k1();
		obj3.k1(1);
		obj3.k1(1,1);
		
		obj3.k1(true);
		obj3.k1(true,1);
		
		obj3.k1(1,1,1);
		obj3.k1(1,true,1);
	}

}
