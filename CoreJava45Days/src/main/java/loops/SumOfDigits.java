package loops;
/*
 * Program:WAP to print sum of digits in a given number
 */
import java.util.Scanner;
public class SumOfDigits {
Scanner scan=new Scanner(System.in);
	public void sum() {
		System.out.println("Enter number");
		int number=scan.nextInt();
	       int sum=0;
		while(number!=0) {
			sum+=number%10;
			number=number/10; // removes last digit from given number each time
		}
		System.out.println("Sum of digits in a given number :"+sum);
		scan.close();
	}
	public static void main(String[] args) {
		SumOfDigits sumofdigits=new SumOfDigits();
		sumofdigits.sum();	}

}
