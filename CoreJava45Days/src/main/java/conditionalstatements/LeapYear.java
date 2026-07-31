package conditionalstatements;

/* 
 * Program : WAP program to find whether the given year is leap year or not
 */
import java.util.Scanner;
public class LeapYear {
	Scanner scan=new Scanner(System.in);
	public void leapYearorNot() {
		System.out.println("Enter year ");
		int year=scan.nextInt();
		
		if(year%4==0&&year%100!=0) {
		System.out.println(year+ " is a Leap Year ");
		}
		
		else if(year%100==0&&year%400==0) {
			System.out.println(year+ " is a Leap Year");
		}
		
		else {
			System.out.println(year+" Not a Leap Year");
		}
	}
	
	public static void main(String[] args) {
		LeapYear leapyear=new LeapYear();
		leapyear.leapYearorNot();

	}

}
