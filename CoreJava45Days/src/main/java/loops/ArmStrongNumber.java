package loops;

/*
 * Program :WAP to check whether given number is ArmStrong or not 
 */
import java.util.Scanner;

public class ArmStrongNumber {
	Scanner scan=new Scanner(System.in);
	public void toPrintArmStrongNumber() {
		System.out.println("Enter a number");
		int number=scan.nextInt();
		int originalnumber=number;
		int count=String.valueOf(number).length();
		int lastDigit;
		int sum=0;
		if(number>0) {
		while(number!=0) {
			lastDigit=number%10;
			sum+=(int)Math.pow(lastDigit,count);
			number=number/10;
		}
	   if(sum==originalnumber)
		   System.out.println(originalnumber +" is an ArmStrong Number ");
	   else
		   System.out.println(originalnumber +" is not an ArmStrong Number ");
		
		}
		else {
			System.out.println("Invalid Input number must be greater than 0");
		}
		scan.close();
		
	}
	public static void main(String[] args) {
		ArmStrongNumber armstrongnumber=new ArmStrongNumber();
		armstrongnumber.toPrintArmStrongNumber();
            
	}

}
