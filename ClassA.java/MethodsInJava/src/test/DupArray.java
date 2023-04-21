package test;

public class DupArray {
	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 1, 6, 8, 4, 9, 5, 10, };
		System.out.println("duplicate no is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[j] + " ");

				}
			}
		}
	}
}
