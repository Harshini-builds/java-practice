package numbers;

/*
 *  To print sum of all Odd digits in given number
 */
import java.util.Scanner;
public class SumOddDigits {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number ");
	int number=scan.nextInt();
	int sum=0;
	while(number!=0) {
		int lastnum=number%10;
		if(lastnum%2!=0) {
			sum+=lastnum;
		}
		number=number/10;
	}
	System.out.println("Sum of all odd digits in given number :"+sum);
	}

}
