package loops;

/*
 * Program :WAP to print sum of odd numbers from 1 to N
 */
import java.util.Scanner;

public class PrintSumOfOddNumbers {
	Scanner scan=new Scanner(System.in);
	public void sumOfOddNumbers() {
		System.out.println("Enter upto number");
		int number=scan.nextInt();
		if(number>0) {
		int sum=0;
		for(int i=1;i<=number;i++) { 
			if(i%2!=0)
				sum+=i;		
		}
		System.out.println("Sum of Odd numbers from 1 to "+number+" :"+sum);
		}
		else {
			System.out.println("Invalid Input !Number  must be greater than 0");
		}
		scan.close();
	}
	public static void main(String[] args) {
		PrintSumOfOddNumbers printsumoffoddnumbers=new PrintSumOfOddNumbers();
		printsumoffoddnumbers.sumOfOddNumbers();

	}

}
