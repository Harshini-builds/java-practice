package conditionalstatements;
/*
 * Program :WAP for Simple Calculator
 */
import java.util.Scanner;
public class SimpleCalculator {
	public int addition(int a, int b) {
		return a+b;
	}
	public int subtraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	public int modulusdivision(int a, int b) {
		return a%b;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	SimpleCalculator calculator=new SimpleCalculator();
	 System.out.println("Enter first number");
	 int num1=scan.nextInt();
	 System.out.println("Enter second number");
	 int num2=scan.nextInt();
	 System.out.println("Enter operator to perform operation");
	 char c=scan.next().charAt(0);
	 System.out.println("=====================================");
	 System.out.println("Simple Calculator");
	 System.out.println("=====================================");
	 switch(c) {
	 case '+':
		 System.out.println("Addition of "+num1 +" ," +num2+":"+calculator.addition(num1,num2));
		 break;
	 case '-':
		 System.out.println("Subtraction of "+num1 +" ," +num2+ ":"+calculator.subtraction(num1,num2));
		 break;
	 case '*':
		 System.out.println("Multiplication of "+num1 +" ," +num2+":"+calculator.multiplication(num1,num2));
		 break;
	 case '/':
		 System.out.println("Division of "+num1 +" ," +num2+":"+calculator.division(num1,num2));
		 break;
	 case '%':
		 System.out.println("Modulus Division of "+num1 +" ," +num2+":"+calculator.modulusdivision(num1,num2));
		 break;
		 default:
			 System.out.println(c+" Invalid Operator ! Please check and re-enter valid operator");
	 } 
	 scan.close();
 }
}

