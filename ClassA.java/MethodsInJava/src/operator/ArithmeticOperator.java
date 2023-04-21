package operator;

public class ArithmeticOperator {
	static	int a=20;
	static int b=10;
	int c;
	public static void main(String[]args) {
		ArithmeticOperator obj = new ArithmeticOperator();
		obj.c = a+b;
		System.out.println("Addition of a+b= "+obj.c  + "\n in post increment display same value " + obj.c++ + "\n again call C the value of c is incremented by 1 " + obj.c + "\n");
		obj.c = a-b;
		System.out.println("subtraction of a-b= "+obj.c+"\n in post decrement dusplay the same value "+obj.c-- +"\n again call c the value of c is decremented by 1"+ obj.c+"\n");
		obj.c = a*b;
		System.out.println("multiplication of  a*b= " +obj.c+"\n in pre increment the value of c is incremented by 1 " + ++obj.c);
		obj.c = a/ b;
		System.out.println("\ndivision of  a/b= " +obj.c+"\n in pre decrement the value of c is decremented by 1 " + --obj.c);
		obj.c = a%b;
		System.out.println("\n modulus of a%b= " +obj.c);
		
		if(a>b) {
			System.out.println("\n a is greater");
		}
		else {
			System.out.println("\n b is greater");
		}
	
		
		if(a==40) {
			System.out.println("\n the value of a is 40");
						
		}
		else {
			System.out.println("\n the value of a is not 40");
		}
		
		
		if(a<b) {
			System.out.println("\n a is greater ");
		}
		else if(a==b) {
			System.out.println("\n a and b are equal");
		}
		
		else if(a!=b) {
			System.out.println("\n a and b are not equal");
		}
		
		if((a==20)&&(b==100)){
			System.out.println("\n the value of a and the value of b is same as given value");
		}
		else{
			System.out.println("\n the value of a and the value of b is not same as given value");
		}
		
		
		if ((a<b)||(a>b)) {
			System.out.println("\n b is not greater");
		}
		else {
			System.out.println("\n b is greater ");
		}
		
		if ((a==b)||(a==b)) {
			System.out.println("\n b is greater");
		}
		else {
			System.out.println("\n a is greater ");
	}
}
}