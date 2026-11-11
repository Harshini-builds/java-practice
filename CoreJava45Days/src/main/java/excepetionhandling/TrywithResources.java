package excepetionhandling;

import java.util.Scanner;
public class TrywithResources {

	public static void main(String[] args) {
	try(Scanner scan=new Scanner(System.in)){
		System.out.println("Enter value for dividend");
		int dividend=Integer.parseInt(scan.nextLine());
		System.out.println("Enter value for divisior");
		int divisior=Integer.parseInt(scan.nextLine());
		if(divisior==0) {
			throw new ArithmeticException("We can't divide any number with 0");
		}
		
			float result=dividend/divisior;
			System.out.println("Result");
	
	}
	catch(ArithmeticException e) {
		System.out.println("We can't divide any number with 0");
	}

	}

}
