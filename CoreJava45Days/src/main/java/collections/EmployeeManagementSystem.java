package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class EmployeeManagementSystem {
	Scanner scan=new Scanner(System.in);
	ArrayList<Employee>emp_details=new ArrayList<>();
	
	public String addEmployee() {
		System.out.println("Enter Employee Id");
		int emp_id=scan.nextInt();
		System.out.println("Enter Employee  name ");
		String emp_name=scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Employee Salary ");
		int emp_salary=scan.nextInt();
		if(emp_details.contains(emp_id)) {
			return "Employee with "+emp_id+" already exists";
		}
		emp_details.add(new Employee(emp_id,emp_name,emp_salary));
		return "Employee details added ";
	}
	
	public String updateSalary() {
		System.out.println("Enter Employee Id, name and Salary");
	     int  emp_id=scan.nextInt();
	     for (Employee emp : emp_details) {

	         if (emp.getId() == emp_id) {

	             System.out.println("Enter new Salary");
	             double emp_sal = scan.nextDouble();

	             emp.setEmp_salary(emp_sal);

	             return "Employee Salary Updated Successfully";
	         }
	     }

	     return "No Employee found with " + emp_id + " Id";
	 }
	
	public String removeEmployee() {
		System.out.println("Enter Employee name ");
		String emp_name=scan.nextLine();
	for(Employee emp:emp_details) {
		if(emp.getEmp_name().equalsIgnoreCase(emp_name)) {
			emp_details.remove(emp);
			return "Employee removed "; 
		}
	}
		return "Employee not found";
	}
	
	public void highestSalaryEmployee() {
		System.out.println(Collections.max(emp_details ,Comparator.comparingDouble(Employee::getEmp_salary))); 
	}
	public void salaryRange() {
          
		    for (Employee emp : emp_details) {

		        if (emp.getEmp_salary() > 30000) {
		            System.out.println(emp);
		        }
		    }
	}
	
public void AllEmployees() {
	if(emp_details.isEmpty()) {
		System.out.println("No Employee details added yet");
		return ;
	}
	for(Employee emp: emp_details) {
		System.out.println(emp);
	}
}
	public static void main(String[] args) {
		EmployeeManagementSystem e=new EmployeeManagementSystem();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Welcome to Employee Portal");
		System.out.println("----------------------------------------------------------------------");
		while(true) {
      System.out.println("1.ADD EMPLOYEE \n2.UPDATE SALARY \n3.REMOVE EMPLOYEE \n 4.HIGH-PAID EMPLOYEE "
		+ "\n5.EMPLOYEES SALARY>30000 \n 6.GET EMPLOYEES \n 7.EXIT");
      System.out.println("Enter your choice");
      int choice=e.scan.nextInt();
      switch(choice) {
      case 1:
    	 System.out.println(e.addEmployee());
    	 break;
      case 2:
    	  System.out.println(e.updateSalary());
    	  break;
      case 3:
    	  System.out.println(e.removeEmployee());
    	  break;
      case 4:
    	  e.highestSalaryEmployee();
    	  break;
      case 5:
    	  e.salaryRange();
    	  break;
      case 6:
    	  e.AllEmployees();
    	  break;
      case 7:
    	  System.out.println("Thanks for visiting Employee's Portal ");
    	  System.exit(0);
    	  break;
    	  default:
    		  System.out.println("Check the choice and enter correctly");
      }
		}
	}
}
