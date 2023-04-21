package patterninjava;

public class Pyramid {
public static void main(String[] args) {
	System.out.println("Pyramid:");
	for(int i=1; i<=5; i++) {		//loop i 
		for(int k=4;k>=i;k--) {	//loop k for space
			System.out.print("=");
			}	//close loop k for space
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}//end of j loop
		System.out.println("");
	}
}
}
