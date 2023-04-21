package calling;

public  class ClassA {
	int phy;
	int chem;
	int maths;
	
	 public void keshav() {
		int phy=90;
		int chem=80;
		int maths=100;
		System.out.println("marks of Keshav : " + " Phy " +phy + " Chem " +chem  +" maths "+maths);
		System.out.println("Total marks " + (phy+chem+maths) );
		System.out.println("");
	 }
	 public void ratnesh() {
		int phy=80;
		int chem=80;
		int maths=90;
		System.out.println("marks of Ratnesh: " + "Phy" +phy + " Chem " +chem  +" maths "+ maths);
		System.out.println("Total marks " + (phy+chem+maths) );
		System.out.println("");
	 }
	 	 public void roshan() {
		int phy=86;
		int chem=90;
		int maths=92;
		System.out.println("marks of Roshan : " + "Phy" +phy + " Chem " +chem  +" maths "+maths);
		System.out.println("Total marks " + (phy+chem+maths) );
		System.out.println("");
	 	 }
	 public static void main(String[]args) {
		 ClassA obj = new ClassA();
		 obj.keshav();
		 obj.ratnesh();
		 obj.roshan();
	 }
	 
	 
}

