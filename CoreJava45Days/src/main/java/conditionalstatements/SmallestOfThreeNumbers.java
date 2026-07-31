package conditionalstatements;

/* 
 * Program: WAP to find the smallest of three numbers
 */

import java.util.Scanner;
public class SmallestOfThreeNumbers {
Scanner scan=new Scanner(System.in);
	public void toFindSmallestNumber() {
		System.out.println("Enter first number ");
		int number1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter second number ");
		int number2=Integer.parseInt(scan.nextLine());
		System.out.println("Enter third number ");
		int number3=Integer.parseInt(scan.nextLine());
		System.out.println("=========================================");
		System.out.println("Smallest Of Three Numbers ");
		System.out.println("=========================================");
		if((number1<=number2)&&(number1<=number3)) {
			System.out.println(number1+" is smallest among "+number2+","+number3);
		}
		else if((number2<=number1)&&(number2<=number3)) {
			System.out.println(number2+" is smallest among "+number1+","+number3);
		}
		else {
			System.out.println(number3+" is smallest among "+number1+","+number2);
		}
			scan.close();
	}
		
	public static void main(String[] args) {
	SmallestOfThreeNumbers smallestofthreenumbers=new SmallestOfThreeNumbers();
	smallestofthreenumbers.toFindSmallestNumber();

	}

}
