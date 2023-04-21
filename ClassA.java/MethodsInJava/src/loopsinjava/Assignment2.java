package loopsinjava;

public class Assignment2 {
	public static void main(String[]args) {
		System.out.println("100 to 0 even number using While loop:-");
		
		int x=100;
		while(x>=0) {
			if(x%2==0) {
				System.out.print(x + " ");
			}
			x--;
		}
	
		System.out.println("\n \n100 to 0 odd number using while loop:-");
		int y=100;
		while(y>=0) {
			if(y%2!=0) {
				System.out.print(y+" ");
			}
			y--;
		}
		System.out.println("\n \n100 to 0 even number using do While loop:-");
		int z=100;
		do {
			if(z%2==0) {
				System.out.print(z +" ");
			}
			z--;
		}
		while(z>=0);
		
		System.out.println("\n \n100 to 0 odd number using do While loop:-");
		int k=100;
		do {
			if(k%2!=0) {
				System.out.print(k +" ");
			}
			k--;
		}
		while(k>=0);
	}
	
}
