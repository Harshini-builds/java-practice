package collections;

import java.util.Iterator;
import java.util.Vector;
public class VectorProgram1 {

	public static void main(String[] args) {
		Vector <Employee> employeedetails=new Vector<Employee>();
		employeedetails.add(new Employee(111,"EMP1",75000));
		employeedetails.add(new Employee(112,"EMP2",85000));
		employeedetails.add(new Employee(113,"EMP3",67000));
		employeedetails.add(new Employee(114,"EMP4",55000));
		System.out.println(employeedetails.remove(1));
		employeedetails.set(1, new Employee(115,"EMP5",95000));
		employeedetails.add(1, new Employee(117,"EMP6",65000));
		Iterator i=employeedetails.iterator();
		System.out.println("-----------------------------------------------");
		System.out.println("Reteriving Employee details from vector using Iterator:");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(employeedetails.get(1).getEmp_id() +" "+employeedetails.get(1).getEmp_name()+" "+employeedetails.get(1).getEmp_salary());
	}

}
