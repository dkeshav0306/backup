package overriding1;

import overriding.Parent1;

public class Child extends Parent1 {
	public static void m1() {
		System.out.println("m1 is in child");
	}
	public static void main(String[] args) {
		Parent1 obj = new Child();
		obj.m1();
	
		/*Child obj1 = new Parent1();
		obj1.m1();    parent cannot call child method it is not allowed in inheritance*/ 
	}

}
