package numbers;

/*
 * Program: To check whether the given number is Automorphic number or not 
 * 
 * Automorphic number is a number whose square result %100 and number  both are equal 
 */
import java.util.Scanner;
public class AutomorphicNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter number ");
    int number=scan.nextInt();
    int originalnum=number;
    int square=(int)Math.pow(number,2);
    String count= String.valueOf(number);
  int  length= count.length();
    
      int divisior=(int)Math.pow(10,length);
     
    if((square%divisior)==number) 
    	System.out.println("Given "+originalnum+" is Automorphic Number ");
    
    else
    	System.out.println("Given "+originalnum+" is not an Automorphic Number");
	}

}
