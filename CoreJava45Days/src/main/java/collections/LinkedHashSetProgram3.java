package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetProgram3 {
	Scanner scan=new Scanner(System.in);
	Set <Employee_Data>e=new LinkedHashSet<>();

	public String addEmployees() {
		System.out.println("Enter employee id ");
		int emp_id=scan.nextInt();
		for(Employee_Data employee:e) {
			if(employee.getEmp_id()==emp_id) {
				return "Employee with "+emp_id+" already exists";
			}
		}
		System.out.println("Enter employee name");
		scan.nextLine();
		String emp_name=scan.nextLine();
		System.out.println("Enter employee role");
		String emp_role=scan.nextLine();
		e.add(new Employee_Data(emp_id,emp_name,emp_role));
		return  "Employee Data added ";
	}
	public void displayAllStudents() {
		if(!(e.isEmpty())) {
			Iterator<Employee_Data>i=e.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		else {
			System.out.println("No Employee Data added yet");
		}
	}
	public Employee_Data searchForEmployee() {
		System.out.println("Enter employee id ");
		int emp_id=scan.nextInt();
		for(Employee_Data employee:e) {
			if(employee.getEmp_id()==emp_id) {
				return employee;
			}
		}
		return null;
	}
	public String updateEmployeeRole() {
		if(e.isEmpty()) {
			return "No Employee Data added yet";
		}
		System.out.println("Enter employee id ");
		int emp_id=scan.nextInt();	
		scan.nextLine(); 
		for(Employee_Data employee:e) {
			if(employee.getEmp_id()==emp_id) {
				System.out.println("Enter employee role");
				String emp_role=scan.nextLine();
				employee.setEmp_role(emp_role);
			}
		}	
		return "Employee Updated Successfully ";
	}
	public String removeEmployee() {
		if(e.isEmpty()) {
			return "No Employee Data added yet";
		}
		System.out.println("Enter employee id ");
		int emp_id=scan.nextInt();	
		Iterator<Employee_Data>i=e.iterator();
		while(i.hasNext()) {
			if((i.next().getEmp_id()==emp_id)) {
				i.remove();
				return "Employee with "+emp_id+" removed Successfully ";
			}
		}

		return "Employee with "+emp_id+" not found ";
	}
	public int totalEmployeeCount() {
		if(!(e.isEmpty())) {
			return e.size();
		}
		return 0;
	}
	public int countSpecifiedRole() {
		scan.nextLine();
		System.out.println("Enter employee role");
		String emp_role=scan.nextLine();
		int count =0;
		Iterator<Employee_Data>i=e.iterator();
		while(i.hasNext()) {
			if(i.next().getEmp_role().equalsIgnoreCase(emp_role)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		LinkedHashSetProgram3 emp=new LinkedHashSetProgram3();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employee Data Management");
		System.out.println("---------------------------------------------------------------------");
		while(true) {
			System.out.println("1.Adding Employee\n2.Display All Employees\n3.Search For Employee\n4.Updates Employee role "
					+ "\n5.Remove Employee \n6.Total Employees Count\n7. Count using Role \n8.Exit");
			System.out.println("Enter your choice ");
			int choice=emp.scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println(emp.addEmployees());
				break;
			case 2:
				emp.displayAllStudents();
				break;
			case 3:
				System.out.println(emp.searchForEmployee());
				break;
			case 4:
				System.out.println(emp.updateEmployeeRole());
				break;
			case 5:
				System.out.println(emp.removeEmployee());
				break;
			case 6:
				System.out.println(emp.totalEmployeeCount());
				break;
			case 7:
				System.out.println(emp.countSpecifiedRole());
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("You have entered wrong number check the menu and re-enter it correctly ");
			}
		}
	}

}
