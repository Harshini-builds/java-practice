package strings;

import java.util.Scanner;

public class WordLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.nextLine();
		String[] words = s.split(" ");
		System.out.println("Length of words in given string is :" + words.length);

	}

}
