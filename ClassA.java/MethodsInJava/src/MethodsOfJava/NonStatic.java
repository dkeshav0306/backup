package MethodsOfJava;
public class NonStatic {
	int a = 40;							// Static variable
	int b = 50;										// Static variable
	static int z ;

	

	public static void main(String[] args) {
	NonStatic dem1 = new NonStatic();
	
	int d= dem1.a-dem1.b;
	int c= dem1.a+dem1.b;
	System.out.println(c);
	System.out.println(d);
	System.out.println(z);


	
	}

}
