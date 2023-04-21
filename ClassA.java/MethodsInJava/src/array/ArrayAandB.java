package array;

import java.util.Arrays;

public class ArrayAandB {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		int c[] = { 5, 4, 2 };
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	}

}
