package strings;

/*
 * Program: To write a program to pint reverse of given string
 */
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        System.out.println("Reverse of " + s + " is :");
       for(int i=s.length()-1;i>=0;i--) {
        	System.out.print(s.charAt(i)+" ");
        }
	}

}
