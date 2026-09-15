package numbers;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=Integer.parseInt(scan.nextLine());
        int factorial=1;
        for(int i=2;i<=number;i++) {
    
             factorial*=i;
            
        }
        System.out.println("Factorial of "+number+" is : "+factorial);
	}

}
