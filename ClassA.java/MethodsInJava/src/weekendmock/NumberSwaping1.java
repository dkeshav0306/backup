package weekendmock;

public class NumberSwaping1 {
public static void main(String[]args) {
	int a=10,b=20;		// with 3 variable 
	System.out.println("Using 3 variable:- ");
	System.out.println("variable a and b before changing value: " + a +","+ b);
	int c=a;
		a=b;
		b=c;
		
		System.out.println("variable a and b after changing value: " + a+ "," +b);
		
	int x=10,y=20;
	System.out.println("\nusing only 2 variable:- ");
	System.out.println("variable x and y before chaging value: " + x+","+y);
	
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("variable x and y after changing value: " + x + "," + y);
}
}
