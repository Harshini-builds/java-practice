package loops;

/*
 * Program :WAP to find Second Largest digit from given number
 */
import java.util.Scanner;
public class SecondLargestDigit {
	Scanner scan=new Scanner(System.in);
public void toPrintSecondLargest() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalnumber=number;
	int largestnum=0;
	int secondlargenum=0;
	int lastDigit;
	if(number>0) {
	while(number!=0) {
		lastDigit=number%10;
		
		if(lastDigit>largestnum) {
			secondlargenum=largestnum;
			largestnum=lastDigit;
		}
		else if(lastDigit<largestnum&&lastDigit>secondlargenum) {
			secondlargenum=lastDigit;
		}
		number=number/10;
	}
	System.out.println("Second largest number of "+originalnumber+" is :"+secondlargenum);
	}
	else {
		System.out.println("Invalid Input number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		SecondLargestDigit secondlargestdigit=new SecondLargestDigit();
		secondlargestdigit.toPrintSecondLargest();
	}

}
