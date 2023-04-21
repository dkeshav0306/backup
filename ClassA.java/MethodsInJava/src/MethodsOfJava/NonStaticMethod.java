package MethodsOfJava;

public class NonStaticMethod {
	public void demo() {
		System.out.println("demo is non static method");
	}
	public static void main(String[] args){
		NonStaticMethod sm = new NonStaticMethod();
		sm.demo();
	}
}
