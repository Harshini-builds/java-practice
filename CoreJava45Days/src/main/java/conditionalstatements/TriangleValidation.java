package conditionalstatements;

/*
 * Program: WAP to validate the sides of triangle
 */
import java.util.Scanner;
public class TriangleValidation {
Scanner scan=new Scanner(System.in);
	public void validateTriangle() {
		System.out.println("Enter first side of triangle");
		int s1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter second side of triangle");
		int s2=Integer.parseInt(scan.nextLine());
		System.out.println("Enter third side of triangle");
		int s3=Integer.parseInt(scan.nextLine());
		if(s1>0&&s2>0&&s3>0) {
			if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1))
				System.out.println("Valid Triangle");
			else
				System.out.println("Invalid Triangle!");
		}
		else {
			System.out.println("Invalid input ! Sides must be greater than 0");
		}
	}
	public static void main(String[] args) {
		TriangleValidation triangleValidation=new TriangleValidation();
		triangleValidation.validateTriangle();
	}

}
