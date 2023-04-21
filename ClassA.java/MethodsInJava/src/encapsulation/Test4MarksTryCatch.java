package encapsulation;

public class Test4MarksTryCatch {
 public void totlaMarks(int marks) {
	 if(marks <= 40) {
		 throw new IllegalArgumentException("faild"); 
	 }
	 else { 
		 System.out.println("Pass");
	 }
	 }
 	public static void main(String[] args) {
	
 		Test4MarksTryCatch ob = new Test4MarksTryCatch();
 		ob.totlaMarks(50);
 		try{
 			ob.totlaMarks(00);
 		}
 		catch(IllegalArgumentException a) { 
 			System.out.println(a.getMessage());
 		}
 		try {
 		ob.totlaMarks(40);
 		}
 		catch(IllegalArgumentException a) { 
 			System.out.println(a.getMessage());
 		}
 	}	  
 
}
