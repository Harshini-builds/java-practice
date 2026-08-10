package loops;

/*
 * Program:WAP to find the sum of digits in a given number
 */
import java.util.Scanner;
public class SumOfDigits {
Scanner scan=new Scanner(System.in);
	public void sum() {
		System.out.println("Enter a number");
		int number=scan.nextInt();
		int sum=0;
		while(number!=0) {
			sum+=number%10;
			number=number/10;
		}
	 System.out.println("Sum of digits in a given number :"+sum);
		scan.close();
	}
	public static void main(String[] args) {
		SumOfDigits sumofdigits=new SumOfDigits();
		sumofdigits.sum();

	}

}
