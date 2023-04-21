package encapsulation;

import java.util.Scanner;

public class HrDept {
	private int salary=10000;
	@SuppressWarnings("null")
	public int getsalary() {
		@SuppressWarnings("resource")
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String Password = sec .nextLine();
		if(Password.equals("keshav@123")) { 
			return salary;
		}
		else {
				return (Integer) null;
		}
		
	}
	




}
