package numbers;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number ");
	int number=scan.nextInt();
	int square=(int)Math.pow(number, 2);
	int lastnum=0;
	int sum=0;
	while(square!=0) {
		lastnum=square%10;
		sum+=lastnum;
		square=square/10;
	}
	if(sum==number) 
	System.out.println("Given number is Neon number ");
	else
		System.out.println("Given number is not a Neon number  ");
	}

}
