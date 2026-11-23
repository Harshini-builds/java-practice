package collections;

public class Employee {
  
	private int id;
	private String emp_name;
	private double emp_salary;
	
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public Employee(int id, String emp_name, double emp_salary) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	
}
