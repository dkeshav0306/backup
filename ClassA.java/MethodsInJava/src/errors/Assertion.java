package errors;

public class Assertion {
	public static void main(String[]args) {
		int input=40;
		assert input >=40 :"failed";
		
		System.out.println("marks is " + input);

	

		int a=10;
		assert a>=40 :"passed";
		System.out.println("numbe is " + a);
	}

}
