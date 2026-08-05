package conditionalstatements;

/*
 * Program :WAP to check the type of triangle
 */
import java.util.Scanner;
public class TriangleType {
Scanner scan=new Scanner(System.in);
	public void checkTriangleType() {
		System.out.println("Enter first side of triangle");
		int s1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter second side of triangle");
		int s2=Integer.parseInt(scan.nextLine());
		System.out.println("Enter third side of triangle");
		int s3=Integer.parseInt(scan.nextLine());
		System.out.println("===============================");
		System.out.println("Triangle Type");
		System.out.println("===============================");
		if(s1>0&&s2>0&&s3>0) {
			if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)) {
			if(s1==s2&&s2==s3)
				System.out.println("Equilateral Triangle");
			else if(s1==s2||s2==s3||s3==s1)
				System.out.println("Isosecles Triangle");
			else
				System.out.println("Scalene Triangle");
			}
			else {
				System.out.println("Invalid Triangle!");
			}
		}
		else {
			System.out.println("Invalid input ! Sides must be greater than 0");
		}
		scan.close();
	}
	public static void main(String[] args) {
		TriangleType triangleType=new TriangleType();
		 triangleType.checkTriangleType();

	}

}
