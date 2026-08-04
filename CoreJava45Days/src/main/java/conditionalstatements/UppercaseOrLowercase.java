package conditionalstatements;

/*
 * Program: WAP to whether the character entered is Uppercase or Lowercase
 */
import java.util.Scanner;
public class UppercaseOrLowercase {
Scanner scan=new Scanner(System.in);
	public void caseChecker() {
		System.out.println("Enter a character ");
		char c=scan.next().charAt(0);
		System.out.println("==============================");
		System.out.println("UpperCase Or LowerCase");
		System.out.println("==============================");
		if(Character.isUpperCase(c))
			System.out.println( c+" is an Upper case Character");
		else if(Character.isLowerCase(c))
			System.out.println( c +" is an Lower Case Character");
		else 
		System.out.println(c + " invalid input ");
		scan.close();	
	}
	
	public static void main(String[] args) {
		UppercaseOrLowercase uppercaseorlowercase=new UppercaseOrLowercase();
		uppercaseorlowercase.caseChecker();

	}

}
