package loopsinjava;

public class WapToPrint0To100WhileLoop {
	public static void main(String[]args) {
		System.out.println("0 to 100 even number using while loop ");
		int x=0;
		while(x<=100) {
			if(x%2==0) {
				
				System.out.print(x + " ");
			}
			x++;
			
		}
		System.out.println("\n");
		System.out.println("100 to 0 even number using while loop ");
		int y=100;
		while(y>=0) {
			if(y%2==0) {
				
				System.out.print(y + " ");
			}
			y--;
		}
	}

}
