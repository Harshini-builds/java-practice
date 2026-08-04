package conditionalstatements;

/*
 * Program: WAP to find name of month based on given month number
 */
import java.util.Scanner;
public class DaysOfMonth {
Scanner scan=new Scanner(System.in);
	public void displayDays() {
		System.out.println("Enter month number ");
		int monthnumber=scan.nextInt();
		System.out.println("=================================");
	    System.out.println("Days In Month");
	    System.out.println("=================================");
		switch(monthnumber) {
		case 1:
			System.out.println("January has 31 days");
			break;
		case 2:
			System.out.println("February has 28 days"); // ignoring leap year
			break;
		case 3:
			System.out.println("March has 31 days");
			break;
		case 4:
			System.out.println("April has 30 days");
			break;
		case 5:
			System.out.println("May has 31 days");
			break;
		case 6:
			System.out.println("June has 30 days");
			break;
		case 7:
			System.out.println("July has 31 days");
			break;
		case 8:
			System.out.println("August has 31 days");
			break;
		case 9:
			System.out.println("September has 30 days");
			break;
		case 10:
			System.out.println("October has 31 days");
			break;
		case 11:
			System.out.println("November has 30 days");
			break;
		case 12:
			System.out.println("December has 31 days");
			break;
			default:
				System.out.println(monthnumber+" Invalid month number ! Please enter a valid number between 1 and 12");
		}
		scan.close();
	}
	public static void main(String[] args) {
		DaysOfMonth daysofmonth=new DaysOfMonth();
		daysofmonth.displayDays();

	}

}
