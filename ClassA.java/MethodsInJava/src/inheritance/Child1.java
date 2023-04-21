package inheritance;

public class Child1 extends Parent {
	public static void m10() {
		System.out.println("M10 is a static method of Child1 class" );
	}
	public static void main(String[] args) {
		m1();
		Child1 obj = new Child1();
		obj.m2();
	}

}
