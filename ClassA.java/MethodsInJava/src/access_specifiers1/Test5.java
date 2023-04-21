package access_specifiers1;



import access_specifiers.Test2;
import access_specifiers.Test3;


public class Test5 extends Test2 {
	public static void main(String[] args) {
		m1();
		Test3.m6();
		System.out.println(a);
		Test5 obj= new Test5();
		System.out.println(obj.b);
		//System.out.println(c);
		System.out.println(d);
		obj.m2();
		
	}
	
	
	
}
