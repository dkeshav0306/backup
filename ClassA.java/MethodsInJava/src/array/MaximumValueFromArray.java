package array;

public class MaximumValueFromArray {
	public static void m1(int[] a) {
		int g = a[0];
		for (int i = 1; i < a.length; i++) {
			if (g > a[i]) {
				g = a[i];
				System.out.println("minimum value from array is " + g);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 50, 70, 60, 90, 3, 100 };
		m1(a);
	}
}