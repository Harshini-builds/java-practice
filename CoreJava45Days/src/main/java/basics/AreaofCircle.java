package basics;

/*
 * Program: Area of Circle
 * Objective: Calculate the area of a circle using the formula
 *           
 */
import java.util.Scanner;
public class AreaofCircle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the radius of circle");
	 double r=scan.nextDouble();
	 final double PI=3.14;
	 double area=PI* (r*r);
	 System.out.println("=========================");
	 System.out.println("Area of Circle  ");
	 System.out.println("=========================");
	 System.out.println("Radius :"+r);
	 System.out.println("PI Value :"+PI);
	 System.out.println("Area of Circle is :"+area);
	}

}
