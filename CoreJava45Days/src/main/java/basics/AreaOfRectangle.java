package basics;

/* Program :Area Of Rectangle 
 * Objective :Calculate the area of rectangle using formula 
 */
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter length of rectangle");
		double length=scan.nextDouble();
		System.out.println("Enter width of rectangle");
		double width=scan.nextDouble();
		if(length>0&&width>0){
		double area=length*width;
		System.out.println("========================");
		System.out.println("Area of Rectangle ");
		System.out.println("========================");
		System.out.println("Length :"+length);
		System.out.println("Width: "+width);
		System.out.println("Area of Rectangle is :"+area);
		}
		else {
			System.out.println("Invalid values ");
		}
		scan.close();
	}
	

}
