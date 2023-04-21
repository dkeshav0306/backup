package weekendmock;

public class FactorialOfANum {
	public static void main(String[] args) {
		int num=3;
		long factorial =1;
		
		for(int i=1; i<=num; i++ ) {
			factorial = factorial * i;
		}
		
		
		//for(int i=num; i>=1; i--) {
			//factorial = factorial * i;
		//}
		System.out.println("The factorial of a number is : " +factorial );
	}

}
