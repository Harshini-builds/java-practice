package loops;

/*
 * Program:WAP to print Odd Numbers upto N
 */
import java.util.Scanner;
public class PrintOddNumbers {
	Scanner scan=new Scanner(System.in);
public void toPrintOddNumbers() {
	System.out.println("Enter upto number");
	int number=scan.nextInt();
	for(int i=1;i<=number;i++) {
		if(i%2!=0)//checks whether number divisible by 2
		System.out.print(i +" ");
	}
	scan.close();
}
	public static void main(String[] args) {
		PrintOddNumbers printOddNumbers=new PrintOddNumbers();
		printOddNumbers.toPrintOddNumbers();
	}

}
