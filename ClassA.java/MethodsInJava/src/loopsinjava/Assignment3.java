package loopsinjava;

public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("find 0 to 100 number using for loop:");
		for(int i=0; i<=100; i++) {
	
				System.out.print( i +" ");
			
		}

		System.out.println(" \n\nfind 0 to 100 even number using for loop:");
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("\n\nfind 0 to 100 odd number using for loop:");
		for(int i=0; i<=100; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	
		System.out.println("\n\nfind 100 to 0 even number using for loop:");
		for(int i=100; i>=0; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
				
		System.out.println("\n\nfind 100 to 0 odd number using for loop:");
		for(int i=100; i>=0; i--) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n\nfind 1 to 100 even numbers using continue keyword:");
		for(int i=1; i<=100; i++) {
			if(i%2!=0) 
				continue;
				System.out.print(i+" ");
			
		}
		
		System.out.println("\n\nfind 1 to 100 odd numbers using continue keyword:");
		for(int i=1; i<=100; i++) {
			if(i%2==0) 
				continue;
				System.out.print(i+" ");
			
		}
		
		System.out.println("\n\nfind 100 to 1 even numbers using continue keyword:");
		for(int i=100; i>=1; i--) {
			if(i%2!=0) 
				continue;
				System.out.print(i+" ");
		}
	
		System.out.println("\n\nfind 100 to 1 odd numbers using continue keyword:");
		for(int i=100; i>=1; i--) {
			if(i%2==0) 
				continue;
				System.out.print(i+" ");
		}
	}
}


