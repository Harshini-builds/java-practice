package strings;

/*
 * Program: To check whether two strings contains same character with same frequency
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1 ");
        String s1=scan.nextLine();
        char[]a1=s1.toUpperCase().toCharArray();
        System.out.println("Enter String2 ");
        String s2=scan.nextLine();
        char[]a2=s2.toUpperCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)) 
        	System.out.println(s1 +" and "+s2+" have same characters with same frequency");
        else
        	System.out.println(s1 +" and "+s2+" haven't same characters with same frequency");
        
	}

}
