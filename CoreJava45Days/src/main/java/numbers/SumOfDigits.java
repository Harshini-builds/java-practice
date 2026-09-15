package numbers;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter starting number ");
       int n1=Integer.parseInt(scan.nextLine());
       System.out.println("Enter upto number ");
       int n2=Integer.parseInt(scan.nextLine());
       int sum=0;
       for(int i=n1;i<=n2;i++) {
    	   sum+=i;
       }
       System.out.println("Sum of numbers from "+n1 +" to "+n2 +" : "+sum);
       
	}

}
