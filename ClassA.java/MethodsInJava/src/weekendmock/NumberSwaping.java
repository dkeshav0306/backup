package weekendmock;

public class NumberSwaping {
	public static void main(String[] args) {
		int a=10, b=20,temp;
			
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		temp=a+b;				//logic 1 extra variable
		a=temp-a;
		b=temp-b;
		System.out.println("changing value of a and b");
		System.out.println("\nvalue of a is "+a);
		System.out.println("value of b is "+b);	
		System.out.println(" ");
		
		a=a+b;					//logic 2 - & + without using 3rd variable
		b=a-b;
		a=a-b;
		System.out.println("again changing value of a and b");
		System.out.println("\nvalue of a is "+a);
		System.out.println("value of b is "+b);	
		System.out.println(" ");
		
		int t=a;		// swapping value with 3rd variable 
			a=b;
			b=t;
		System.out.println("again changing value of a and b");
		System.out.println("\nvalue of a is "+a);
		System.out.println("value of b is "+b);	
	}

}
