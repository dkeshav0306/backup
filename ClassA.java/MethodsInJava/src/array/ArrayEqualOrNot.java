package array;

import java.util.Arrays;

public class ArrayEqualOrNot {
	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 7, 9, 6 };
		int b[] = { 4, 8, 6, 2, 1, 6 };
		int c[] = { 1, 5, 4, 7, 9, 6 };

		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
	}
}
