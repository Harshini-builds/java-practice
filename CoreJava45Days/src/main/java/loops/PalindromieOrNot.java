package loops;

/*
 * Program:WAP to find whether given number is palindromie or not
 */
import java.util.Scanner;
public class PalindromieOrNot {
	Scanner scan=new Scanner(System.in);
public void toFindPalindromieOrNot() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int number2=number;
	int reversenum=0;
	if(number>0) {
	while(number!=0) {
		reversenum=reversenum*10+(number%10);
		number=number/10;
	}
	
	if(number2==reversenum)
		System.out.println(number2 +" is a palndromie ");
	else
		System.out.println(number2 +" is not palndromie");
	}else {
		System.out.println("Invalid Input ! Number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		PalindromieOrNot palindromieornot=new PalindromieOrNot();
		 palindromieornot.toFindPalindromieOrNot();

	}

}
