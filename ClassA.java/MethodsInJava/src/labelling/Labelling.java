package labelling;

public class Labelling {
public static void main(String[] args) {
	System.out.println("Using Label in For loop:");
	loop1: for(int i=1;i<=5;i++) {
		 for(int j=1;j<=5;j++) {
			if(j==4) 
				break loop1;
				System.out.println(j);
			
		}
	
	}
}
}
