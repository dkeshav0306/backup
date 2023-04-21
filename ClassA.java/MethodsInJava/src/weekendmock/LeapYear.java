package weekendmock;

public class LeapYear {
	
/* There is 2 condition to check if it is a leap year or not
 	1. is year is divisible by 400
 	2. is year is divisible by 4 and not divisible by 100
 	 if this is true then print leap year else not leap year  */	
	
/*Concept of Leap Year - 
The rule states:
“Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, but these centurial years are leap years if they are exactly divisible by 400.”

For example,
if year = 2400, it is leap year,(Condition 1 satisfied)
but if year = 2200, is NOT a leap year, (Cond. 2 not satisfied),
and if year = 2020, is a leap year, (Cond. 2 satisfied).

To check whether a year is a leap year or not, you need to check the following 3 conditions:
IF
1. Any year that is divisible by 400 is definitely a leap year.
ELSE IF
2. If divisible by 4 AND not divisible by 100 then a leap year.
ELSE
not a leap year.
*/
	public static void main(String[]args) {
	int year =2003;
	if (year%400==0) {	
		System.out.println("This is a Leap year");
	}
	
	else if(year%4==0 && year%100!=0) {
		System.out.println("This is a leap year");
	}
	
	else {
		System.out.println("This is not a leap year");
	}
	}
}
