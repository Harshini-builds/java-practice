package loops;

/*
 * Program:WAP to print Even numbers upto N
 */
import java.util.Scanner;
public class PrintEvenNumbers {
	Scanner scan=new Scanner(System.in);
	public void toprintEvenNumbers() {
		System.out.println("Enter upto number");
		int number=scan.nextInt();
		for(int i=2;i<=number;i++) {
			if(i%2==0)                //checks if the number is even or not
				System.out.print(i +" ");
		}
		scan.close();
	}

	public static void main(String[] args) {
		PrintEvenNumbers printEvenNumbers=new PrintEvenNumbers();
		printEvenNumbers.toprintEvenNumbers();
	}

}
