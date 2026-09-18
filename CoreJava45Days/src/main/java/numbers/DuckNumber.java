package numbers;

/*
 * Program: To check whether given number is Duck number or not
 */
import java.util.Scanner;
public class DuckNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int number=scan.nextInt();
	    String numberstring=String.valueOf(number);
	    if(numberstring.contains("0"))
	    	System.out.println("Given number "+number+" is Duck Number");
	    else
	    	System.out.println("Given number "+number+" is not Duck Number");

	}

}
