package strings;

import java.util.Scanner;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        String result="";
        for(int i=0;i<s.length();i++) {
        	Character ch=s.charAt(i);
        	if(s.indexOf(ch)==i) {
        		result=result+ch;
        	}
        }
        System.out.println("----------------------------------------");
        System.out.println("String after removing duplicates :"+result);
	}

}
