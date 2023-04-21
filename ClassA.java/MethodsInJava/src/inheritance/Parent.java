package inheritance;

import inheritance1.Child;

public class Parent  {
	static int a =500;		//global static variable of parent
	int b=100;				//global non-static  variable of parent 
		public static void m1() {
			System.out.println("M1 is static method. ");
		}
		
		public void m2() {
			System.out.println("M2 is Non-static method. ");
		}
		
		public static void main(String[] args) {
		Child.m4();	
		Child1.m10();
		System.out.println( a + "A is static/global variable of parent class.");
		Parent object = new Parent();
		System.out.println(object.b+"B is Non-static/global variable of parent class.");
		}
}


