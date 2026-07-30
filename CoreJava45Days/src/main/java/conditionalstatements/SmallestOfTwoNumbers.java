package conditionalstatements;
/*
 * Program: WAP to find the smallest number of two numbers
 */
import java.util.Scanner;
public class SmallestOfTwoNumbers {

	public void toFindSmallestNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number ");
		int number1=scan.nextInt();
		System.out.println("Enter second number ");
		int number2=scan.nextInt();
		System.out.println("====================================");
		System.out.println("Finding Smallest  Number ");
		System.out.println("====================================");
		
		if(number1<number2)
			System.out.println(number1+" is smaller than "+number2);
		else if(number2<number1)
			System.out.println(number2+" is smaller than "+number1);
		else
			System.out.println("Both are equal");
	}
	public static void main(String[] args) {
		SmallestOfTwoNumbers smallestoftwonumbers=new SmallestOfTwoNumbers();
		smallestoftwonumbers.toFindSmallestNumber();

	}

}
