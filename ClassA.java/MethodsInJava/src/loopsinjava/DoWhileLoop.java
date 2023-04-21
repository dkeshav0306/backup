package loopsinjava;


public class DoWhileLoop {
	// do
	// {
	//	 body	
	// }
	// while(condition);
	public static void main(String[] args) {
		int x=0;
		do
		{
			System.out.println("loop "+ x);
			x++;
		}
		while(x<=5);
		do
		{
			System.out.println("\nprint loop");
			x++;
		}
		while(x==5);
		
	}
}
