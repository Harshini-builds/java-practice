package OOPS;

public class BankAccount extends Bank {
	
int currentBalance;
public BankAccount(String accountholdername) {
	super();
    currentBalance=getBalance();
	setAccountholdername(accountholdername);
}
public void  credit(int amount) {
	if(amount>0) {
	currentBalance=currentBalance+amount;
	setBalance(currentBalance);
	}
	else {
		System.out.println("Invalid credit amount check and re enter again");
	}
	System.out.println("Balance in account after credit :"+getBalance());
	
}
public void withdraw(int amount) {
	if(amount<=currentBalance) {
	currentBalance=currentBalance-amount;
	setBalance(currentBalance);
	System.out.println("Balance in account after withdraw :"+getBalance());
	}
	else {
	System.out.println("No sufficient funds to perform withdraw operation");
	}
	
}
public int checkBalance() {
	
	return getBalance();
}

	public static void main(String[] args) {
	BankAccount a1=new BankAccount("Harshini");
            a1.credit(-500);
            System.out.println("Current Balance in your account :"+a1.checkBalance());
            a1.withdraw(5000);
	}

}
