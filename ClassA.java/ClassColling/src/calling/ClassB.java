package calling;
public class ClassB {
	int phy;
	int chem;
	int maths;
	 public static void main(String[]args) {
		 ClassB obj1 = new ClassB();
		 obj1.phy=70;
		 obj1.chem=80;
		 obj1.maths=90;
		 ClassB obj2 = new ClassB(); 
		 obj2.phy=90;
		 obj2.chem=80;
		 obj2.maths=60;
		 ClassB obj3 = new ClassB();
		 obj3.phy=100; 
		 obj3.chem=90;
		 obj3.maths=60;
		 
		 System.out.println("Marks of Rohan :"  + " Phy " + obj1.phy  +" Chem "  +  obj1.chem +  " Maths " +  obj1.maths);
		 System.out.println("Total marks " + (obj1.phy+obj1.chem+obj1.maths) );
		 System.out.println("");
		 
		 System.out.println("Marks of Mohan :"  + " Phy " + obj2.phy  +" Chem "  +  obj2.chem +  " Maths " +  obj2.maths);
		 System.out.println("Total marks " + (obj2.phy+obj2.chem+obj2.maths) );
		 System.out.println("");
		
		 System.out.println("Marks of Soham :"  + " Phy " + obj3.phy  +" Chem "  +  obj3.chem +  " Maths " +  obj3.maths);
		 System.out.println("Total marks " + (obj3.phy+obj3.chem+obj3.maths) );
		 System.out.println("");
		  
		
	 }

}
