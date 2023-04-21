package weekendmock;

public class GreatestNoIn3No {
public static void main(String[] args) {
	int a=10, b=400, c=50;
	if(a>b && a>c) {
		System.out.println(a+" is largest no");
	}
	else if(b>a && b>c) {
		System.out.println(b+" is largest no");
	}
	else {
		System.out.println(c+" is largest no");
	}
	
	//ternary operator 
	
	int largest = a>b?a:b;  // largest of  a and b
		largest=c>largest?c:largest; //largest of c and largest 
		System.out.println(largest+" is largest no");
		
		//same line ternary operator
		
		int larg=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(larg+" is largest no");

}
}
