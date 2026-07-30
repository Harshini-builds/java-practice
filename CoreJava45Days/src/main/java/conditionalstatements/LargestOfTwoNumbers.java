package conditionalstatements;

/* 
 * Program : WAP to find the largest of two numbers
 */
import java.util.Scanner;
public class LargestOfTwoNumbers {
Scanner scan=new Scanner(System.in);
	public void findlargestNumber() {
		System.out.println("Enter first number ");
		int number1= scan.nextInt();
		System.out.println("Enter second number");
		int number2=scan.nextInt();
		System.out.println("====================================");
		System.out.println("Finding Largest  Number ");
		System.out.println("====================================");
		if(number1>number2) 
		System.out.println(number1+ " is larger than "+number2);
		else if(number1<number2)
			System.out.println(number2+ " is larger than "+number1);
		else
			System.out.println("Both "+number1+","+number2+" are equal");
		
	}
	public static void main(String[] args) {
		LargestOfTwoNumbers largestnumber=new LargestOfTwoNumbers();
		largestnumber.findlargestNumber();

	}

}
