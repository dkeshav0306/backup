package test;

public class Test1 {

	public static void m1(int a[]) {
		int g = a[0];
		for (int i = 1; i < a.length; i++) {
			if (g < a[i]) {
				g = a[i];
			System.out.println("maximum value from array " + g);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 50, 10, 6, 90, 1, 7 };
		m1(a);
	}

}
