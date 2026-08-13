package loops;

/*
 * Program:WAP to check whether given number is prime or not prime 
 */
import java.util.Scanner;
public class PrimeNumber {
	Scanner scan=new Scanner(System.in);
public void toCheckPrime() {
	System.out.println("Enter a number ");
	int number=scan.nextInt();
	int count=0;
	if(number>0) {
	for(int i=2;i<=number;i++) {
		if(number%i==0)
			count++;
	}
	if(count==1)
		System.out.println(number +" is a Prime Number");
	else 
		System.out.println(number+" is not a Prime Number");
	}else {
		System.out.println("Invalid Input!Number must be greater than zero");
	}
	scan.close();
}
	public static void main(String[] args) {
		PrimeNumber primenumber=new PrimeNumber();
		primenumber.toCheckPrime();
	}

}
