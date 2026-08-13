package loops;

/*
 * Program:WAP to check whether given number is perfect number or not
 */
import java.util.Scanner;
public class PerfectNumberOrNot {
	Scanner scan=new Scanner(System.in);
	
public void toCheckPerfectNum() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int sum=0;
	for(int i=1;i<number;i++) {
		if(number%i==0)
			sum+=i;
	}
	if(number==sum)
		System.out.println(number+" is a Perfect Number");
	else
		System.out.println(number+" is not a Perfect Number");
	scan.close();
}
	public static void main(String[] args) {
		PerfectNumberOrNot perfectornot=new PerfectNumberOrNot();
		perfectornot.toCheckPerfectNum();

	}

}
