package loops;

/*
 * Program:WAP to print multiplication table of given number
 */
import java.util.Scanner;
public class MultiplicationTable {
Scanner scan=new Scanner(System.in);
public void toPrintTable() {
	System.out.println("Enter number to print the table");
	int number=scan.nextInt();
	if(number>0) {
	System.out.println("================================");
	System.out.println(number+" Table");
	System.out.println("================================");
	for(int i=1;i<=10;i++) {
		System.out.println(number+" * "+i+" = " +number * i);
	}
	}
	else {
		System.out.println("Invalid Input !Number  must be greater than 0");
	}
	scan.close();
}
	public static void main(String[] args) {
		MultiplicationTable multiplicationtable=new MultiplicationTable();
		multiplicationtable.toPrintTable();

	}

}
