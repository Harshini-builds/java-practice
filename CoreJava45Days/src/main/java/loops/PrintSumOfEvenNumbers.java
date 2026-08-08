package loops;

/*
 * Program :WAP to print sum of even number upto N
 */
import java.util.Scanner;

public class PrintSumOfEvenNumbers {
	Scanner scan=new Scanner(System.in);
	public void sumOfEvenNumbers() {
		System.out.println("Enter upto number");
		int number=scan.nextInt();
		if(number>0) {
		int sum=0;
		for(int i=2;i<=number;i+=2) { 
				sum+=i;		
		}
		System.out.println("Sum of Even numbers from 2 to "+number+" :"+sum);
		}
		else {
			System.out.println("Invalid Input !Number  must be greater than 0");
		}
		scan.close();
	}
	public static void main(String[] args) {
		PrintSumOfEvenNumbers printsumofevennumbers=new PrintSumOfEvenNumbers();
		printsumofevennumbers.sumOfEvenNumbers();

	}

}
