package strings;

/*
 * Program:To find first non-repeated character in given string
 */
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        for(int i=0;i<s.length();i++) {
        	Character ch=s.charAt(i);
        	if(s.indexOf(ch)==s.lastIndexOf(ch)) {                                   
        		System.out.println(s.charAt(i)+" is first non-repeated character");  // we can use HashMap for 0(n) 
        		break;
        	}
        }

	}

}
