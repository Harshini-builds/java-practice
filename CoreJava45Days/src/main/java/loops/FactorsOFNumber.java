package loops;

/*
 * Program:WAP to print factors of a given number
 */
import java.util.Scanner;
public class FactorsOFNumber {
	Scanner scan=new Scanner(System.in);
public void Factors() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	if(number>0) {
    System.out.println("Factors of "+number+" is :");
	for(int i=1;i<=number;i++) {
		if(number%i==0)
			System.out.print(i+" ,");
	}
	}
	else {
		System.out.println("Invalid Input!Number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		FactorsOFNumber factorsofnumber=new FactorsOFNumber();
		factorsofnumber.Factors();
	}

}
