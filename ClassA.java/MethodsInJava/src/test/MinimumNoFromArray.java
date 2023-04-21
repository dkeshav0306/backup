package test;

public class MinimumNoFromArray {
	public static void m1(int a[]) {
		int g=a[0];
		for(int i=1; i<a.length; i++) {
			if (g > a[i]) {
				g=a[i];
			}
		}
		System.out.println("Minimum valur from array "+ g);
	}
	public static void main(String[] args) {
	int a[]= {5,1,9,6,7,3,4,2};
	m1(a);
	}
}
