package numbers;

/*
 * Program:To print given number from decimal to binary
 */
import java.util.Scanner;
public class DecimalTOBinary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scan.nextInt();
		int power=1;
		int binary=0;
		while(number>0) {
		binary+=(number%2)*power;
		number=number/2;  
		power*=10;
		
		}
		System.out.println("Binary result is :"+binary);
	}

}
