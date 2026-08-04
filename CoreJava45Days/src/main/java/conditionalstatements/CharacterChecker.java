package conditionalstatements;

/*
 * Program :WAP to identify the entered character is alphabet,digit or special character
 */
import java.util.Scanner;
public class CharacterChecker {
	Scanner scan=new Scanner(System.in);
public void validation() {
	System.out.println("Enter a character");
	char c=scan.next().charAt(0);
	System.out.println("====================================");
	System.out.println("Character Checker ");
	System.out.println("====================================");
	if(Character.isLetter(c)) {   
// Character.isLetter is a static method present in Character wrapper class checks the given character is letter or not
		System.out.println(c +" is an Alphabet");
	}
	else if(Character.isDigit(c)) {
// Character.isDigit is a static method present in Character wrapper class checks the given character is Digit or not
		System.out.println(c +" is a Digit");
	}
	else {
		System.out.println( c+" is a Special Character ");
	}
}
	public static void main(String[] args) {
	CharacterChecker characterchecker=new CharacterChecker();
	characterchecker.validation();

	}

}
