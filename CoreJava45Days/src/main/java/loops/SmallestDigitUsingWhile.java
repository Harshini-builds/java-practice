package loops;

/*
 * Program:WAP to find the smallest digit from given number using while
 */
import java.util.Scanner;
public class SmallestDigitUsingWhile {
	Scanner scan=new Scanner(System.in);
public void toFindSmallestDigit() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalNumber=number;
	int smallestDigit=number%10;
	int lastDigit;
	if(number>0) {
		while(number != 0) {
		     lastDigit = number%10;

		    if(lastDigit < smallestDigit)
		        smallestDigit = lastDigit;

		    number = number / 10;
		}
	System.out.println("Smallest digit of "+originalNumber+" : "+smallestDigit);
	}
	else {
		System.out.println("Invalid Input ! Number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		SmallestDigitUsingWhile smallestdigitusingwhile=new SmallestDigitUsingWhile();
		smallestdigitusingwhile.toFindSmallestDigit();
	}

}
