package conditionalstatements;

/*
 * Program: WAP to check the given character is vowel or consonant
 */
import java.util.Scanner;
public class VowelOrConsonant {
Scanner scan=new Scanner(System.in);
	public void toFindvowelorConsonant() {
		System.out.println("Enter a Character");
		char c=scan.next().charAt(0);
		System.out.println("=====================================");
		System.out.println("Vowel Or Consonant");
		System.out.println("=====================================");
		if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') 
			System.out.println(c +" is Vowel");
		
		else if(Character.isLetter(c))
			System.out.println( c+" is a Consonant");
		else
			System.out.println(c +" invalid input ! Please enter Only Alphabets ");
		scan.close();
	}
	public static void main(String[] args) {
		VowelOrConsonant vowelorconsonant=new VowelOrConsonant();
		vowelorconsonant.toFindvowelorConsonant();

	}

}
