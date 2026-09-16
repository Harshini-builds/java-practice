package numbers;

import java.util.Scanner;
public class CountOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
         System.out.println("Enter a number ");
         int number=scan.nextInt();
         int originalnum=number;
         int count=0;
         while(number!=0) {
        	 count++;
        	 number=number/10;
         }
         System.out.println("Count of "+originalnum +" is :"+count);
	}

}
