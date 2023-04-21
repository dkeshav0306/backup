package overriding;

public class Parent {
 public void m1() {
	 System.out.println("m1 is in parent");
 }
 
 public static void main(String[] args) {
	Parent obj = new Parent();
	obj.m1();
}
	 
 
}
