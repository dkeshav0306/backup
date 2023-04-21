package array;

public class AnonymousArray {
	public static void m1(int a[]) {
		for(int b: a) {
			System.out.print(b+" ");
		}
	}
	public static void main(String[] args) {
		m1(new int []  {1,2,3,4,5});
	}
}
