package encapsulation;

public class Test1TryCatchFinally {
public static void main(String[] args) {
	System.out.println(1);
	try {
	System.out.println(100/5);
	}
	catch(ArithmeticException a )
	{
	System.out.println("num is not / by 0");
	}
	finally {
		System.out.println("no matters exception occured or not finally always excute.");
	}
	System.out.println(3);
}
}
