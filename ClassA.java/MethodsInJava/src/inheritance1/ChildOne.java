package inheritance1;

public class ChildOne extends ParentOne {
	static int z=50;
	public static void method1() {
		System.out.println("method1 is a static method of ChildOne class");
	}
	public static void main(String[] args) {
		m1();
		ChildOne object =new ChildOne();
		object.m2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
	}

}
