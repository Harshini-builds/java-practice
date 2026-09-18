package numbers;

import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number ");
	int number=scan.nextInt();
	int originalnum=number;
	int lastnum=0;
	int sum=0;
	int product=1;
	  while(number!=0) {
		  lastnum=number%10;
		  sum+=lastnum;
		  product*=lastnum;
		  number=number/10;
	  }
	  if(sum==product)
	  System.out.println("Given number "+originalnum+" is Spy Number");
	  else
		  System.out.println("Given number "+originalnum+" is not Spy Number");
	}

}
