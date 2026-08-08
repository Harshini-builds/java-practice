package loops;

/*
 * Program: WAP to print 1 to N numbers
 */
import java.util.Scanner;
public class Print1ToNNumbers {
Scanner scan=new Scanner(System.in);
	public void toPrintNumber() {
		System.out.println("Enter up to number");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print(i +" ");
		}
		scan.close();
	}
	public static void main(String[] args) {
		Print1ToNNumbers print1ToNNumbers=new Print1ToNNumbers();
		print1ToNNumbers.toPrintNumber();

	}

}
