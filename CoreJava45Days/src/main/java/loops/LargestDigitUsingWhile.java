package loops;

/*
 * Program:WAP to find largest digit from given number using while loop 
 */
import java.util.Scanner;
public class LargestDigitUsingWhile {
Scanner scan=new Scanner(System.in);
public void toFindLargestDigit() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalNumber=number;
	int largestDigit=0;
	int lastDigit=0;
	while(number!=0) {
		lastDigit=number%10;
		if(lastDigit>largestDigit)
			largestDigit=lastDigit;
		number=number/10;
	}
	System.out.println("Largest digit of "+originalNumber+" : "+largestDigit);
	scan.close();
}
	public static void main(String[] args) {
		LargestDigitUsingWhile largestnumusingwhile=new LargestDigitUsingWhile();
		largestnumusingwhile.toFindLargestDigit();
	}

}
