package loops;

/*
 * Program:WAP to print numbers from N to 1
 */
import java.util.Scanner;
public class PrintNto1Numbers {
Scanner scan=new Scanner(System.in);
	public void toPrintNumbers() {
		System.out.println("Enter starting number");
		int number=scan.nextInt();
		if(number>0) {
		for(int i=number;i>=1;i--) {
			System.out.print(i +" ");
		}
		}
		else {
			System.out.println("Invalid Input ! Enter number greater than 0");
		}
		scan.close();
	}
	public static void main(String[] args) {
		PrintNto1Numbers printNto1Numbers=new PrintNto1Numbers();
		 printNto1Numbers.toPrintNumbers();

	}

}
