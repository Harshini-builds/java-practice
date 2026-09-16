package numbers;

import java.util.Scanner;
public class Palandromie {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	      System.out.println("Enter number "); 
	      int number =scan.nextInt();
	      int originalnum=number;
	      int lastnum=0;
	      int reversenum=0;
	      while(number!=0) {
	  		lastnum=number%10;
	  		 reversenum=reversenum*10+lastnum;
	  		number=number/10;
	  	}
	      if(reversenum==originalnum) 
	    	  System.out.println("Palandromie number : "+originalnum);
	      else
	    	  System.out.println("Not Palandormie number :"+originalnum);
	      
	}

}
