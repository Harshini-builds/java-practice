import java.util.Scanner;

/*
 * Program:WAP to check whether given is prefect number or not
 */
import java.util.Scanner;
public class PerfectNumberOrNot {
	Scanner scan=new Scanner(System.in);
public void togetPerfectNumber() {
	System.out.println("Enter a number ");
	int number=scan.nextInt();
	int sum=0;
	if(number>0) {
         for (int i=1;i<=number/2; i++) {
             if (number%i == 0) 
                 sum += i; 
         }
	if(number==sum)
		System.out.println(number+" is a Perfect Number");
	else
		System.out.println(number+" is not a Perfect Number");
	}else {
		System.out.println("Invalid Input number must be greater than 0");
	}

	scan.close();
}
	public static void main(String[] args) {
		PerfectNumberOrNot prefectornot=new PerfectNumberOrNot();
		prefectornot.togetPerfectNumber();
	

	}

}
