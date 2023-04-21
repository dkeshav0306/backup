package weekendmock;
	//Fibonacci Series 0to10
	//fibonacci series first 10 no.
public class FibonacciSeries0to100 {
	public static void main(String[]args) {
		long n=20, n1=0, n2=1;	
	
		for(int i=1;i<=n;i++) {	
		
			System.out.print(n1+" ");
			
			long n3=n1+n2;
			
			n1=n2;
			 n2=n3;
			
			if(n1>n) {	//
				 break;	//
			 }			//
		}
	}

}
