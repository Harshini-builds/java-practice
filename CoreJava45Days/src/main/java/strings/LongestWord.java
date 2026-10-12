package strings;

/*
 * Program:To find the longest word in given string 
 */
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.nextLine();
		String[] word_arr = s.split(" ");
		int longest_length=0;
		String longest_word=" ";
		for(int i=0;i<word_arr.length;i++) {
			String word=word_arr[i];
			if(word.length()>longest_length) {
			longest_length=word.length();
			longest_word=word;
			
		}
		}
		System.out.println("Longest word in given string is :"+longest_word);
	}

}
