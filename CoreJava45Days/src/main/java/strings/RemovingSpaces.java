package strings;

/*
 * Program:To remove the spaces in given string
 */
import java.util.Scanner;

public class RemovingSpaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        if(s.contains(" ")) {
        	s=s.replace(" ", "");
        }
        System.out.println("--------------------------------");
        System.out.println("String value :"+s);
	}

}
