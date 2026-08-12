package loops;

/*
 * Program :WAP to find  Even and Odd count from given number
 */
import java.util.Scanner;
public class CountOfEvenAndOdd {
	Scanner scan=new Scanner(System.in);
public void toPrintEvenOrOdd() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalnumber=number;
	int evencount=0;
	int oddcount=0;
	if(number>0) {
	while(number!=0) {
		
	     if((number%10)%2==0)
	    	 evencount++;
	     else
	    	 oddcount++;
	     number=number/10;
	}
	System.out.println("Number :"+originalnumber);
	System.out.println("Even count :"+evencount);
	System.out.println("Odd count  :"+oddcount);
    
	}
	else {
		System.out.println("Invalid Input number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		 CountOfEvenAndOdd  countofevenandodd=new  CountOfEvenAndOdd ();
		 countofevenandodd.toPrintEvenOrOdd();
	}

}
