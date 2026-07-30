package conditionalstatements;

/*Program:Positive,Negative or Zero
 * Objective: Check whether number is Positive,Negative or Zero
 */
import java.util.Scanner;
public class PositiveOrNegative {
Scanner scan=new Scanner(System.in);
public void checkNumber() {
	System.out.println("Enter a number ");
   int number=Integer.parseInt(scan.nextLine());
   System.out.println("===================================");
   System.out.println("Positive,Negative Or Zero");
   System.out.println("===================================");
   if(number>0)
	   System.out.println(number +" is a positive number ");
   else if(number<0)
	   System.out.println(number +" is a negative number ");
   else
	   System.out.println(number +" is zero");
   scan.close();
}
	public static void main(String[] args) {
	PositiveOrNegative positiveornegative=new PositiveOrNegative();
	positiveornegative.checkNumber();
	}

}
