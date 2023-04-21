package argumentsandreturn;

public class WithoutArgumentAndWithReturnType {
	public int m1() {
		return 30;
	}
	
	public static double m2() {
		return 8.8;
	}
	
	public static void main(String[]args) {
		WithoutArgumentAndWithReturnType obj = new WithoutArgumentAndWithReturnType();
		System.out.println (obj.m1());
		
		System.out.println(m2());
	}
}
