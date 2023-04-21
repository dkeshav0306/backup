package array;

public class DescendingOrder {
	public static void main(String[] args) {

		int[] a = { 50, 60, 10, 23, 90, 40, 100, 200, 3, 9, 30 };

		for (int i = a.length - 1; i >= 0; i--) {

			for (int j = i - 1; j >= 0; j--) {

				if (a[i] < a[j]) {

					int temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}

	}

}
