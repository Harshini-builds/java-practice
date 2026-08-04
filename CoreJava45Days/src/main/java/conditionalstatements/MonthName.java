package conditionalstatements;

/*
 * Program: WAP to find the name of month based on the given month number
 */
import java.util.Scanner;
public class MonthName {
	Scanner scan=new Scanner(System.in);
public void toFindMonthName() {
	System.out.println("Enter month number");
	int monthnumber=scan.nextInt();
	System.out.println("===========================");
	System.out.println("Month Name");
	System.out.println("===========================");
	switch(monthnumber) {
	case 1:
		System.out.println("January");
		break;
	case 2:
		System.out.println("February");
		break;
	case 3:
		System.out.println("March");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
	case 6:
		System.out.println("June");
		break;
	case 7:
		System.out.println("July");
		break;
	case 8:
		System.out.println("August");
		break;
	case 9:
		System.out.println("September");
		break;
	case 10:
		System.out.println("October");
		break;
	case 11:
		System.out.println("November");
		break;
	case 12:
		System.out.println("December");
		break;
		default:
			System.out.println(monthnumber+" Invalid month number !");
	}
	scan.close();
}
	public static void main(String[] args) {
		 MonthName monthname=new  MonthName();
		 monthname.toFindMonthName();
	}

}
