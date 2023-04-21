package weekendmock;
//Ascii Value of a,
//Ascii Value of a to z and A to Z
public class AsciiValue {
	public static void main(String[]args) {
		char ch='A';
		int i=ch;
		System.out.println("Ascii VAlue of "+ch+ " is "+ i );
	
		System.out.println("");
		
	char capitalchar ='A';
	char smallchar	='a';
	for(int k='A'; k<='Z';k++) {
		System.out.print(capitalchar + ":"+ k+ ", ");
		capitalchar++;
	
	}
	
	System.out.println("\n");
	
	for (int l='a';l<='z';l++) {
		System.out.print(smallchar +":" + l+ ", ");
		smallchar++;
	}
	
	
	}
}
