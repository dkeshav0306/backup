package test;

public class AnonymousArray {
	public static void m1(int a[]) {
		for (int b : a) {
			System.out.print(b + " ");
		}
	}

	public void m2(int c[]) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Anonymous Array:");
		m1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("\n\nAnonymous Array:");
		AnonymousArray ob = new AnonymousArray();
		ob.m2(new int[] { 7, 6, 5, 4, 3, 2 });
		System.out.println("\n\nArray:");
		int z[] = { 10, 20, 30, 40, 50 };
		m1(z);
		System.out.println("\n\nArray:");
		ob.m2(z);
	}
}
