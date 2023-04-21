package encapsulation;

public class ThrowsT1 {
	public static void main(String[] args) throws InterruptedException {
		int a=20,b=20,c,d;
		c=a+b;
		Thread.sleep(2000);
		System.out.println(c);
		Thread.sleep(2000);
		d=c+a;
		Thread.sleep(1000);
		System.out.println(d);
	}

}
