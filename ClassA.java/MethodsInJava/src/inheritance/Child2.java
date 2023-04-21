package inheritance;

import inheritance1.Child;
	
public class Child2 extends Parent {
	static int a=10;
	int b=50;
	public void callgloble() {
	
		System.out.println(Parent.a+" This is a global variable of Parent class\n");
		//to call global variable parent class in child class 
		//we use parent class name.variable name.
		System.out.println(super.b+" This is a Global variable of parent class\n");
		//to call global non static variable parent class in child class 
		//non-static method we use "super" keyword .variable name. 
	}
	public static void main(String[] args) {
	m1();
	Child2 obj=new Child2();
	obj.m2();
	Child.m4();
	System.out.println("\n");
	System.out.println(a +" This is a global variable of child2 \n");
	System.out.println(obj.b +" This is a global variable of child2\n");
	obj.callgloble();
	
	
}
}
