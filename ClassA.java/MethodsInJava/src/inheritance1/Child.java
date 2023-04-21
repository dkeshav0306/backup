package inheritance1;

import inheritance.Parent;

public class Child extends Parent {
	public static void m4() {
		System.out.println("m4 is a static method of chile class.");
	}
	public static void main(String[] args) {
		m1();
		Parent obj = new Parent();
		obj.m2();
	}

}
