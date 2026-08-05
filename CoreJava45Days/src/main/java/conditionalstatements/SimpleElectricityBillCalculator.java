package conditionalstatements;

/*
 * Program :WAP to calculate the electricity bill based on given units
 */
import java.util.Scanner;
public class SimpleElectricityBillCalculator {
Scanner scan=new Scanner(System.in);
	public void bill() {
		System.out.println("Enter number of units ");
		int units=scan.nextInt();
		System.out.println("===================================");
		System.out.println("Electricity Bill");
		System.out.println("===================================");
		if(units<0)
			System.out.println("Invalid units !Please enter non-negative units ");
		else if(units<=100) 
			System.out.println("Your electricity bill :"+(units*2));
		else if(units>=101&&units<=200) 
			System.out.println("Your electricity bill :"+(units*3));
		else if(units>=201&&units<=300)
			System.out.println("Your electricity bill:"+(units*5));
		else
			System.out.println("Your electricity bill :"+(units*7));
		scan.close();
	}
	public static void main(String[] args) {
		SimpleElectricityBillCalculator simpleElectricityBillCalculator=new SimpleElectricityBillCalculator();
		simpleElectricityBillCalculator.bill();

	}

}
