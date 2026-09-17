package numbers;
import java.util.Scanner;
public class SumOfEvenDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int number=scan.nextInt();
		int sum=0;
		while(number!=0) {
			int lastnum=number%10;
			if(lastnum%2==0) {
				sum+=lastnum;
			}
			number=number/10;
			}
		System.out.println("Sum of all even digits in given number is :"+sum);
	}

}
