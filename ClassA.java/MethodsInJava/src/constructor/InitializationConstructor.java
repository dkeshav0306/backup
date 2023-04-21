package constructor;

public class InitializationConstructor {
	int a;					//non static variable
	int b;					//"
	int c;					//"
public InitializationConstructor(int a, int b, int c) {// creating constructor method using args 
		this.a=a;		//provide value for non static variable a is same as argument variable a
		this.b=b;		//provide value for non static variable b is same as argument variable b
		this.c=c;		//provide value for non static variable c is same as argument variable c
	
}
	public static void main(String[]args) {
		InitializationConstructor obj = new InitializationConstructor(60,70,80);// creating object for constructor 
		System.out.println(obj.a);		//calling non static variable a
		System.out.println(obj.b);		//calling non static variable b
		System.out.println(obj.c);		//calling non static variable c
	
	}

}
