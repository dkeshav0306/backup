package operator;

public class IncrementAndDecrement {
		int a=40;
		int b=40;
		int c;
		int d;
	public static void main(String[]args) {
		 int a= 10;
		 int b=20;
		 int c = a+b;
		 System.out.println(c);		//a+b
		 System.out.println(c++);	//post increment, value of c is print before +1 the value of c is not change 
		 System.out.println(c + "\n"); 	// in this the c value change and add +1
		 int d = a+b;
		 System.out.println(d);		//a+b
		 System.out.println(d--);//post decrement, value of c is print before -1 the value of c is not change 
		 System.out.println(d + "\n");	//// in this the c value change and add -1
		 
		 IncrementAndDecrement obj = new IncrementAndDecrement();
		 obj.c= obj.a + obj.b;
		 System.out.println(obj.c++);	//post increment, value of c is print before +1 the value of c is not change
		 System.out.println(obj.c);		// in this the c value change and add +1
		 System.out.println(++obj.c + "\n");	// Pre increment
		 
		 obj.d= obj.a + obj.b;
		 System.out.println(obj.d--);	//post decrement, value of c is print before -1 the value of c is not change
		 System.out.println(obj.d);		// in this the c value change and add -1
		 System.out.println(--obj.d + "\n");	// Pre decrement
	
	}
		

}
