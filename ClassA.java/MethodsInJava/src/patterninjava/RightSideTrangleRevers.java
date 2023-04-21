package patterninjava;

public class RightSideTrangleRevers {
	public static void main(String[] args) {
		System.out.println("Right side trangle revers:");
		for(int i=5;i>=1;i--) {			// for row
			for(int k=5; k>i; k--) {	// for space
				System.out.print("=");
				} //end loop k for space 
			for(int j=1;j<=i;j++) {		//for loop j
				System.out.print("* ");
			}	// end j loop
		System.out.println("");
		}
	}

}
