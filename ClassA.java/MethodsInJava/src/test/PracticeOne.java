package test;

public class PracticeOne {
	public int m1(boolean a) {		//with argument and return type
		System.out.println("with argument and return type");
		return 1;
	}

	public void m2(int a) {		//with argument and no return type
		System.out.println("with argument and no return type");
	}
	
	public static int m3(boolean a) { //with argument and with return type
		System.out.println("with argument and with return type");
		return 100;
	}
	
	public static void m4(int a) {	//with argument and no return type
		System.out.println("with argument and no return type");
	}
	public static void m1() {		// no argument and no return type
		System.out.println("no argument and no return type");
	}
	
	public static void main(String[]args) {
		PracticeOne obj =new PracticeOne();
		obj.m1(true);
		obj.m2(0);
		m3(false);
		m4(5);
		m1();
	
	}
}
