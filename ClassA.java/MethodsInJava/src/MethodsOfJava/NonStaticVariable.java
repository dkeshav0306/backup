package MethodsOfJava;

public class NonStaticVariable {
 	static int a=20;		//non static variable 		
	int b=40;

	public static void main(String[] args) {
		
	
		// creating a object to perform addition 
		NonStaticVariable obj = new NonStaticVariable();
		NonStaticVariable obj1 = new NonStaticVariable();
		NonStaticVariable obj2= new NonStaticVariable();
		NonStaticVariable obj3= new NonStaticVariable();
		NonStaticVariable obj4= new NonStaticVariable();
		obj1.b =40;
		obj2.b=50;
		obj3.b=60;
		obj4.b=70;
		
		int c= a+obj4.b;
		int d= a-obj.b;
		System.out.println(c);
		System.out.println(d);
	}
	
}
