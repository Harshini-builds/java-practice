package strings;

/*
 * Program: To print count of vowels and consonants in a string
 */
import java.util.Scanner;

public class CountingVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        int vowels=0;
        int consonants=0;
       for(int i=0;i<s.length();i++) {
    	   Character ch=Character.toUpperCase(s.charAt(i));
    	   if(Character.isLetter(ch)) {
    	  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
    		  vowels++;
    	  
    	  else 
    		  consonants++;
    	   }
        }
       System.out.println("-------------------------------------");
      System.out.println("Vowels count:"+vowels);
      System.out.println("Consonants count:"+consonants);
	}

}
