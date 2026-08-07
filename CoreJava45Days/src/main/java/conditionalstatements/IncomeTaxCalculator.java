package conditionalstatements;

/*
 * Program: WAP to calculate the tax based on income
 */
import java.util.Scanner;
public class IncomeTaxCalculator {
Scanner scan=new Scanner(System.in);
	public void taxCalculation() {
		System.out.println("Enter yout Income");
		long income=scan.nextLong();
		System.out.println("==================================");
		System.out.println("Tax Calculation");
		System.out.println("==================================");
		if(income<0) 
			System.out.println("Invalid income");
		
		else if(income>=0&&income<=250000) 
			
			System.out.println("Tax Amount : ₹"+0.0);
		
		else if(income>=250001&&income<=500000) 
			
			System.out.println("Tax Amount : ₹"+(income*0.05));
		
		else if(income>=500001&&income<=1000000) 
			System.out.println("Tax Amount : ₹" +(income*0.20));
		
		else 
			System.out.println("Tax Amount : ₹"+(income*0.30));
		
		scan.close();
	}
	public static void main(String[] args) {
		IncomeTaxCalculator incomeTaxCalculator=new IncomeTaxCalculator();
		incomeTaxCalculator.taxCalculation();
	}

}
