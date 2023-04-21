package access_specifiers;

public class Test1 {
	public static int a=10;
	public int b=20;
	static	int c=30;
	protected static int d=40;
	private static int k=50;
	final int f=70;
	public static void m1() {
	
		System.out.println("m1");
	}

	public void m2() {
	System.out.println("m2");
	}
	
	public static void main(String[] args) {
		System.out.println(k);
	}
	
}
