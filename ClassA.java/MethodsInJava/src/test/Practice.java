package test;

public class Practice {
	int a = 10;				// non static variable
	static int b = 20;		// static variable
	
	public static void m1() {					// static method m1
		int a =50;			// local variable
		int b =60;			// local variable
		System.out.println(a);
		System.out.println(b);
		Practice obj = new Practice();
		System.out.println(obj.a);		// calling global non static variable a in static method m1 using obj 
		System.out.println(Practice.b); // calling global static variable b in static method m1 using class name
		System.out.println("m1 is static method");
		Practice obj1=new Practice();
		obj1.m2();								//m2 non static method calling m1 static method using object 
	}
	public void m2() {							// non static method m2 
		int a = 100;
		int b =200;
		System.out.println(a);	// calling local variable
		System.out.println(b);	// calling local variable
		System.out.println(this.a);//calling non static variable a inside non static method m2 using this keyword 
		System.out.println(Practice.b);// calling static variable b inside non static method m2 using class name 
		System.out.println("M2 is non sttic method"); 
	}
	public void m3() {							// non static method m3 
		System.out.println();
		m1();							// m1 static method calling m3 non static method
		m2();							// m2 non static to m3 non static direct call 
		
	}
	public static void main(String[]args) {
		m1();									//m1 static method calling directly main static method  
		Practice obj = new Practice();
		obj.m2();								//non static m2 to static calling main method using obj  
		obj.m3();								//non static m3 to static calling main method using obj
		
		
		
	}
}

