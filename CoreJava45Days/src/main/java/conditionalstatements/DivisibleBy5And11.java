package conditionalstatements;

/* 
 * Program :WAP to find the given number is divisible by 5 and 11
 */
import java.util.Scanner;
public class DivisibleBy5And11 {

	public void checkDivisibility() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int number=scan.nextInt();
		System.out.println("===========================================");
		System.out.println("Divisibility Check");
		System.out.println("===========================================");
		if(number%5==0&&number%11==0) 
		System.out.println(number+" is divisible by both 5 and 11");
		else if(number%5==0&&number%11!=0)
			System.out.println(number+" is divisible by 5 but not by 11");
		else if(number%5!=0&&number%11==0)
			System.out.println(number+" is  divisible by 11 but not by 11");
		else
			System.out.println(number+" is  divisible with neither 5 nor 11 ");
	}
	public static void main(String[] args) {
	
DivisibleBy5And11 divisibleby5and11=new DivisibleBy5And11();
divisibleby5and11.checkDivisibility();
	}

}
