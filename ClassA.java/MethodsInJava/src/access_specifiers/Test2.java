package access_specifiers;
public class Test2 extends Test1 {
	 static void m4() {
		 System.out.println("m4");
	 }
	 public static void main(String[] args) {
		m1();
		Test2 obj = new Test2();
		obj.m2();
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(c);
		System.out.println(d);
		//System.out.println(k);
		System.out.println(obj.f);
	 }
	

}
