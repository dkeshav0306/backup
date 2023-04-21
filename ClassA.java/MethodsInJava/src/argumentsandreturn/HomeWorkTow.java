package argumentsandreturn;

public class HomeWorkTow {
	public void method(int phy, int chem, int maths, String name) {
		System.out.println("Marks Obtain By: " + name + ":- Phy " + phy +", Chem " + chem+ ", Maths " + maths + "." );
		System.out.println("");
	}

	public void allStudent() {
		method(90,80,70,"Rohan" );
		method(80,70,60,"Rohit" );
		method(70,60,50,"Raju" );
	}
	
	public static void main(String[]args) {
		HomeWorkTow obj = new HomeWorkTow();
		obj.allStudent();
	}
}
