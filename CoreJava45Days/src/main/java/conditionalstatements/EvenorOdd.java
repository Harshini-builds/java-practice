package conditionalstatements;

/*Program : Even or Odd 
 * Objective: Write a Java program to check whether a given number is Even or Odd.
 */
import java.util.Scanner;
public class EvenorOdd {
 Scanner scan=new Scanner(System.in);
	public void checkEvenOrOdd() {
		System.out.println("Enter a number :");
		int number=Integer.parseInt(scan.nextLine());
		System.out.println("===============================");
		System.out.println("Even or Odd");
		System.out.println("===============================");
		if(number%2==0)                                           //validation
			System.out.println(+number +" is an even number");
		
		else 
			System.out.println(+number + " is an odd number");	
		scan.close();
	}
	public static void main(String[] args) {
		EvenorOdd evenorodd=new EvenorOdd();
		evenorodd.checkEvenOrOdd();

	}

}
