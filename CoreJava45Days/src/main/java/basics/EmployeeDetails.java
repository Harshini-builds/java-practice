package basics;

/* 
 * Program: Employee Details
 * Objective: Read employee information using Scanner
 *            and display it using instance variables.
 * 
 */


import java.util.Scanner;
public class EmployeeDetails {

int employeeId;
String employeeName;
String department;
double salary;
char gender;
boolean isPermanant;
	public void details() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee id ");
		employeeId=scan.nextInt();// For integer
		
		System.out.println("Enter employee name");
		employeeName=scan.nextLine(); // For String
		
		scan.nextLine();// To fix the immediate printing of statement to enter the department name 
		System.out.println("Enter department name ");
		department=scan.nextLine();
		
		System.out.println("Enter  salary ");
		salary=scan.nextDouble();// For double
		
		System.out.println("Enter gender ");
		gender=scan.next().charAt(0);// for Character
		
		System.out.println("Enter permenant job or not");
		isPermanant=scan.nextBoolean();// For boolean
		
		System.out.println("**********  Employee Details ********** ");
		System.out.println("Employee Id :"+ employeeId);
		System.out.println("Employee name :"+employeeName);
		System.out.println("Department :"+department);
		System.out.println("Salary :"+salary);
		System.out.println("Gender :"+gender);
		System.out.println("Is permenant :"+isPermanant);
		scan.close();// closing the scanner 
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.details();
		System.out.println("Thanks for visting our company !");
        
	}

}
