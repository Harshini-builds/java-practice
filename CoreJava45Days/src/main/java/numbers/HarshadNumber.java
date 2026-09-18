package numbers;

/*
 * Program: To check whether given number is Harshad Number or not
 */
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number =scan.nextInt();
        int originalnum=number;
        int lastnum=0;
    	int sum=0;
    	while(number!=0) {
    		lastnum=number%10;
    		sum+=lastnum;
    		number=number/10;
    	}
    	if(originalnum%sum==0)
    		System.out.println("Given number "+originalnum+" is Harshad Number");
    	else
    		System.out.println("Given number "+originalnum+" is not a Harshad Number");
	}

}
