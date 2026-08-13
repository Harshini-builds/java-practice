package loops;

/*
 * Program:WAP to check whether given number is Strong Number Or not
 */
import java.util.Scanner;
public class StrongNumberOrnot {
	Scanner scan=new Scanner(System.in);
public void toCheckStrongNumber() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalnumber=number;
	int sum=0;
	int lastDigit=0;
	if(number>0) {
	while(number!=0) {
		int factorial=1;
		lastDigit=number%10;
		for(int i=1;i<=lastDigit;i++) {
			factorial*=i;
		}
		sum+=factorial;
		number=number/10;
	}
	if(originalnumber==sum)
		System.out.println(originalnumber+" is a Strong Number");
	else
		System.out.println(originalnumber+" is not a Strong Number");
	}else {
	System.out.println("Invalid Input !Number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		StrongNumberOrnot strongnumberornot=new StrongNumberOrnot();
		strongnumberornot.toCheckStrongNumber();

	}

}
