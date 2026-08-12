package loops;

/*
 * Program:WAP to find product of digits from given number
 */
import java.util.Scanner;
public class ProductOfDigits {
	Scanner scan=new Scanner(System.in);
public void toPrintProduct() {
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int originalnumber=number;
	int product=1;
	int lastDigit;
	if(number>0) {
	while(number!=0) {
		lastDigit=number%10;
		
		/*if(lastDigit==0) {
			number=number/10;  logic to ignore 0 in given number
			continue;
		}*/
		
		product*=lastDigit;
		number=number/10;
		}
		
		System.out.println("Product of "+originalnumber+" is :"+product);
	}
	
	else {
		System.out.println("Invalid Input number must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		ProductOfDigits productofdigits=new ProductOfDigits();
		productofdigits.toPrintProduct();

	}

}
