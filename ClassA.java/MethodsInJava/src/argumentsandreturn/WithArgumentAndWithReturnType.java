package argumentsandreturn;

public class WithArgumentAndWithReturnType {
	
	public char m1(double a) {
		return 20;
		
	}
	public static boolean m2(int a) {
		return true;
	}
	
	public static void main(String[]args) {
		WithArgumentAndWithReturnType obj = new WithArgumentAndWithReturnType();
		int b = obj.m1(5);
		System.out.println(b);
		
		System.out.println(m2('a'));
	}
	
}
