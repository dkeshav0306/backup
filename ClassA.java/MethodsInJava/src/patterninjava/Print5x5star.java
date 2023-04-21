package patterninjava;

public class Print5x5star {
public static void main(String[] args) {
	System.out.println("Print 5*5 star using for loop:");
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
}
}
