package loops;

/*
 * Program:WAP to print fibbonaic series of given numbers upto nth term
 */
import java.util.Scanner;

public class FibbinoaciSeries {
	Scanner scan=new Scanner(System.in);
public void toPrintFibbinoaciSeries() {
	System.out.println("Enter first number");
	int number1=scan.nextInt();
	System.out.println("Enter second number");
	int number2=scan.nextInt();
	System.out.println("Enter the term number");
	int term=scan.nextInt();
	if(number1>=0&&number2>=0&&term>0) {
		System.out.println("Fibbonaci Series of "+number1+" ,"+number2+" of "+term+" th is :");
	for(int i=1;i<=term;i++) {
		int c=number1+number2;
		System.out.print(c+" ,");
		number1=number2;
		number2=c;
	}
	}
	else {
		System.out.println("Invalid Input!Number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		FibbinoaciSeries fibbinoaciseries=new FibbinoaciSeries();
		fibbinoaciseries.toPrintFibbinoaciSeries();

	}

}
