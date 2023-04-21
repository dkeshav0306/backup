package array;

public class SingleDimensionArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};	//using literals
		int b[]= new int[10];		//instantaneous array  //array using new keyword
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		b[5]=6;
		b[6]=7;
		b[7]=8;
		b[8]=9;
		b[9]=10;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
