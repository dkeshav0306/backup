package patterninjava;

public class RightSideTrangle {
	public static void main(String[]args) {
		System.out.println("Right side trangle");
		for(int i=1;i<=5;i++){		//for row
			for(int k=4;k>=i;k--) { //for space loop
				System.out.print("=");
			}//end space loop
			for(int j=1;j<=i;j++) {// for j loop
				System.out.print("* ");
			}//end j loop
			System.out.println("");
			
		}
	}

}
