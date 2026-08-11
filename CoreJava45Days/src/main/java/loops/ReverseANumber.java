package loops;
import java.util.Scanner;
public class ReverseANumber {
	Scanner scan=new Scanner(System.in);
public void toPrintReverseNumber() {
	System.out.println("Enter number");
	int number=scan.nextInt();
	int num=number;
	int reversenumber=0;
	while(number!=0) {
		reversenumber=reversenumber*10+(number%10);
		System.out.println(reversenumber);
		number=number/10;
	}
	System.out.println("Reverse number of "+num+" is :"+reversenumber);
}
	public static void main(String[] args) {
		ReverseANumber reverseanumber=new ReverseANumber();
		reverseanumber.toPrintReverseNumber();
	}

}
