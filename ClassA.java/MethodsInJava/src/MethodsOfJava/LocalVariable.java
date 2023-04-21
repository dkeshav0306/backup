package MethodsOfJava;

public class LocalVariable {
	int a=10;			// non static variable	---- global variable
	static int b=20;	// static variable		----
	
	public void m2() {
		int a=20;		//local variable
		System.out.println(a);
		System.out.print(this.a);		//we use"this.variable"to access non static variable
	}									//inside non static method(only for non static method)
	
	public static void m1() {
		int a= 50;		//local variable
		int b=1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(LocalVariable.b);//we use "class name.variable"to access static variable
	}										//in any method (only for static variable)
	
	public static void main(String[]args) {
		m1();
		LocalVariable obj1=new LocalVariable();
		obj1.m2();
	}
	}
