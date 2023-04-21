package constructor;

public class HomeWorkThree {
	public HomeWorkThree(String name ,int phy, int chem, int maths) {	//get variable inside constructor argument  
		System.out.println(name+":" +"Phy "+phy+", Chem "+chem+", Maths "+maths+"."+" \n Total: "+(phy+chem+maths)+"\n");
	}									//print the variable which define in argument
	public static void main(String[]args) {
		new HomeWorkThree("Rohit" , 80, 90, 80);   // by using new reference  of constructor assign values in variable 
		new HomeWorkThree("Rohan" , 70, 94, 60);
		new HomeWorkThree("Raju" , 90, 50, 80);
		
	}
}
