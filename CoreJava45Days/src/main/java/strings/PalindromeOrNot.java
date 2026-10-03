package strings;

/*
 * Program:To check whether given string is palindrome or not
 */
import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        String reversetext="";
       for(int i=s.length()-1;i>=0;i--) {
    	   reversetext=reversetext+s.charAt(i);
        }
       System.out.println("----------------------------");
      if(reversetext.equals(s)) 
    	  System.out.println("\n"+s+" is Palindrome");
      
      else
    	  System.out.println("\n"+s+ "is not Palindrome");
	}

}
