package loops;

/*
 * Program:WAP to find count of digits in given number
 */
import java.util.Scanner;
public class CountNumberOfDigits {
	Scanner scan=new Scanner(System.in);
public void getCount() {
	System.out.println("Enter number");
	int number=scan.nextInt();
	int number2=number;
	int count=0;
	
	if(number==0)
		count=1;
	
	while(number!=0) {
		number=number/10; // removes last digit from given number each time
		count++;
	}
	System.out.println("Count of digits in "+number2+" is : "+count );
	scan.close();
}
	public static void main(String[] args) {
		CountNumberOfDigits countofnumberofdigits=new CountNumberOfDigits();
		countofnumberofdigits.getCount();

	}

}
