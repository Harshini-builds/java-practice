package conditionalstatements;

/*
 * Program :WAP to find the largest of four numbers
 */
import java.util.Scanner;
public class LargestOfFourNumbers {
Scanner scan=new Scanner(System.in);
	public void toFindLargestNumber() {
		System.out.println("Enter first number ");
		int n1=scan.nextInt();
		System.out.println("Enter Second number");
		int n2=scan.nextInt();
		System.out.println("Enter Third number");
		int n3=scan.nextInt();
		System.out.println("Enter fourth number ");
		int n4=scan.nextInt();
		System.out.println("==================================");
		System.out.println("Largest Number");
		System.out.println("==================================");
		if(n1==n2&&n2==n3&&n3==n4)
			System.out.println("All are equal");
		else if(n1>n2&&n1>n3&&n1>n4)
			System.out.println(n1+" is Largest Number");
		else if(n2>n3&&n2>n4)
			System.out.println(n2+" is Largest Number");
		else if(n3>n4)
			System.out.println(n3+ " is Largest Number ");
		else 
			System.out.println(n4 +" is Largest Number");
		scan.close();
	}
	public static void main(String[] args) {
		LargestOfFourNumbers largestofFournumbers=new LargestOfFourNumbers();
		largestofFournumbers.toFindLargestNumber();
	}

}
