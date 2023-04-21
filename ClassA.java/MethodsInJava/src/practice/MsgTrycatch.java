package practice;

public class MsgTrycatch {
	int a= 10;
	int b=5;
	int c=a+b;
	int x=0;
	public static void main(String[] args) {
	
	MsgTrycatch ob = new MsgTrycatch();
		System.out.println(ob.c);
		System.out.println(ob.a);
		System.out.println(ob.b);
		try {
		System.out.println(ob.c/ob.x);
		}
		catch(ArithmeticException xyz) {
			System.out.println(xyz.getMessage());
		}
		System.out.println(ob.a+ob.b+ob.c);
	}

}
