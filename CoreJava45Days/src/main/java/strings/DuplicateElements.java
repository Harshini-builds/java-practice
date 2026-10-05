package strings;

/*
 * Program:To print duplicate elements in given string
 */
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter String ");
	        String s=scan.nextLine();
	        for(int i=0;i<s.length();i++) {
	        	Character ch=s.charAt(i);
	        	int count=0;
	        	for(int j=0;j<s.length();j++) {
	        		if(ch==s.charAt(j)) {
	        			count++;
	        		}
	        	}
	        	if(s.indexOf(ch)==i&&count>1) {
	        		System.out.print(ch +" ");
	        	}
	        }
	}

}
