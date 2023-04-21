package test;

public class MaximumValueFromArray {

	public static void m1(int a[]) {
		int g = a[0];
		for (int i = 1; i < a.length; i++) {
			if (g < a[i]) {
				g = a[i];

			}
		}
		System.out.println("Maximum Value from Array " + g);
	}

	public static void main(String[] args) {
		int a[] = { 6, 4, 5, 1, 8, 10, 90, 100, 70 };
		m1(a);
	}
}
