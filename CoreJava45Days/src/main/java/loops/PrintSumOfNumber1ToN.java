package loops;

/*
 * Program:WAP to print sum of number from 1 to N
 */
import java.util.Scanner;
public class PrintSumOfNumber1ToN {
	Scanner scan=new Scanner(System.in);
public void sumOfNumbers() {
	System.out.println("Enter upto number");
	int number=scan.nextInt();
	int sum=0;
	if(number>0) {
	for(int i=1;i<=number;i++) {
		sum+=i;// adds number and stores in sum 
	}
	System.out.println("Sum of Numbers from 1 to "+number+" : "+sum);
	}
	else {
		System.out.println("Invalid Input ! Enter number greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		PrintSumOfNumber1ToN printSumOfNumber1ToN=new PrintSumOfNumber1ToN();
		printSumOfNumber1ToN.sumOfNumbers();
	}

}
