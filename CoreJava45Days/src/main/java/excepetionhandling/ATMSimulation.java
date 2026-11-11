package excepetionhandling;

/* 
 * Program :WAP to simulate basic ATM operations such as Check Balance,Deposit, Withdrawal, and Exit using a switch statement
 */
import java.util.Scanner;

public class ATMSimulation {
	Scanner scan=new Scanner(System.in);
public static double intial_balance=1000;// same Intial balance 
private double balance=intial_balance;
public void greet() {
	System.out.println("Welcome to v-Bank ");
	System.out.println("Select the bank operations and enter the options ");
	
	while(true) {
		System.out.println("1.CheckBalance \n2.Deposit \n3.WithDraw \n4.Exit");
		int option=scan.nextInt();
		switch(option) {
		case 1:
			System.out.println("=============================");
			this.checkBalance();
			System.out.println("=============================");
			break;
		case 2:
		
			System.out.println("Total Balance after depositing  : ₹"+this.deposit());
			
			break;
		case 3:
			
			System.out.println("Total Balance after withdraw :₹"+this.withDrawal());
			break;
		case 4:
			System.out.println("Thank you for visiting V-Bank portal !!!");
			System.exit(0);
			break;
			default:
				System.out.println("Invalid Option ! Please check and re-enter again");
		}
	}
}

public void  checkBalance() {
	System.out.println("Balance :"+balance);
}
public double deposit() {
	System.out.println("Enter the amount that you want to deposit");
	double amount=scan.nextDouble();
	balance=balance+amount;
	System.out.println("=============================");
	System.out.println("Amount successfully deposited to your account : ₹"+amount);
	System.out.println("=============================");
	return balance;
}
public double withDrawal() {
	System.out.println("Enter the amount that you want to withdraw");
	double amount=scan.nextDouble();
	try {
		if(amount<=0) {
			throw new ArithmeticException("Enter Valid Amount!!!");
		}
	if(amount>balance) {
		throw new ArithmeticException("Insufficient Funds!!!");
	}
	else {
	balance=balance-amount;
	System.out.println("=============================");
	System.out.println("Amount successfully  withdraw from your account : ₹"+amount);
	System.out.println("=============================");
	
	}
	
	}
	catch(Exception e) {
		System.out.println("Withdraw failed due to insufficent funds ! Please check and re-enter correct amount");
	}
	return balance;
}
	public static void main(String[] args) {
		ATMSimulation atmSimulation=new ATMSimulation ();
		 atmSimulation.greet();
	}

}
