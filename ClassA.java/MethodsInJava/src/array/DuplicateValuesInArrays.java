package array;

public class DuplicateValuesInArrays {
	public static void main(String[] args) {
		int a[] = { 5, 1, 5, 4, 8, 1, 9, 10, 15, 16, 15 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[j] + " ");
				}
			}
		}
	}
}
