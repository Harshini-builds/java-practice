package strings;

/*
 * Program:To find the frequency of characters in given string
 */
import java.util.Scanner;

public class FrequencyOfCharacters {

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
        	if(s.indexOf (ch)==i) {  //compares index value with character first occurrence value if it matches count prints
        		System.out.println(ch +" "+count);     
        	}
        }

	}

}
