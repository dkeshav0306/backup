package encapsulation;

public class Test2 {
	public static void main(String[] args) throws ArithmeticException, InterruptedException {
		System.out.println(1);
		Thread.sleep(1000);
		System.out.println(10/0);
		System.out.println(3);
	}
}
