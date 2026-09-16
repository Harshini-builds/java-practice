package numbers;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number ");
	int number=scan.nextInt();
	int originalnum=number;
	int lastnum=0;
	int reversenum=0;
	while(number!=0) {
		lastnum=number%10;
		 reversenum=reversenum*10+lastnum;
		
		number=number/10;
		
	}
	System.out.println("Reverse number of "+originalnum+" is : "+reversenum);
	}

}
