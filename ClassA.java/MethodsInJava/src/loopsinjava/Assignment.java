package loopsinjava;

public class Assignment {
		public static void main(String[] args) {
			
		
		System.out.println("0 to 100 even number using do While loop:-");
		int x=0;
		do {
			if(x%2==0){
				System.out.print(x + " ");
				}
			x++;
			}
		while(x<=100);
			
		
		System.out.println("\n \n0 to 100 odd number using do While loop:-");
		int y=0;
		do {
			if(y%2!=0){
				System.out.print(y + " ");
				}
			y++;
			}
		while(y<=100);
		
		System.out.println("\n \n0 to 100 odd number using While loop:-");
			int z=0;
			while(z<=100) {
				if(z%2!=0) {
					System.out.print(z + " ");
				}
				z++;
			}

		}
		
}
