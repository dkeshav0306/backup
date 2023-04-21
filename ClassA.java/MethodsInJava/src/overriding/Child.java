package overriding;

public class Child extends Parent {
	public void m1() {
		System.out.println("m1 is in child");
	}
	
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
		
		Child obj1 = new Child();
		obj1.m1();
		
		/* Child obj2 = new Parent();
		obj2=m1();parent cannot call child method it is not allowed in inheritance*/   
	}

}
