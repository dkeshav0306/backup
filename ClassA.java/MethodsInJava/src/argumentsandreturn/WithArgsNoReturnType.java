package argumentsandreturn;

public class WithArgsNoReturnType {
	public void m1(int a) {
		System.out.println(a);
	}
	public static void m2(boolean d) {
		System.out.println(d);
	}
	
	public static void main(String[]args) {
		WithArgsNoReturnType obj = new WithArgsNoReturnType();
		obj.m1(100);
		
		m2(true);
	}
}
