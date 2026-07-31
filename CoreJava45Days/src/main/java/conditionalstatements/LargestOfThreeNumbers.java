package conditionalstatements;

/*
 * Program :WAP to find the largest of three numbers 
 */
import java.util.Scanner;
public class LargestOfThreeNumbers {
Scanner scan=new Scanner(System.in);
public void toFindLargestNumber() {
	System.out.println("Enter first number ");
	int number1=Integer.parseInt(scan.nextLine());
	System.out.println("Enter second number ");
	int number2=Integer.parseInt(scan.nextLine());
	System.out.println("Enter third number ");
	int number3=Integer.parseInt(scan.nextLine());
	System.out.println("=========================================");
	System.out.println("Largest Of Three Numbers ");
	System.out.println("=========================================");
	if((number1>number2)&&(number1>number3)) {
		System.out.println(number1+" is largest among "+number2+","+number3);
	}
	else if((number2>number1)&&(number2>number3)) {
		System.out.println(number2+" is largest among "+number1+","+number3);
	}
	else {
		System.out.println(number3+" is largest among "+number1+","+number2);
	}
		scan.close();
}
	public static void main(String[] args) {
		LargestOfThreeNumbers largestofthreenumbers=new LargestOfThreeNumbers();
		largestofthreenumbers.toFindLargestNumber();

	}

}
