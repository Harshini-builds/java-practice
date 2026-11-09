package constructors;

public class CopyConstructor {

	String employee_name;
    float job_experience;
    
    public CopyConstructor(String name,float job_experience) {
    	this.employee_name=name;
    	this.job_experience=job_experience;
    }
    public CopyConstructor(CopyConstructor copyconstructor) {
   // even we not declare the variable as this.name=copyconstructor name values won't be same
    	this.employee_name=copyconstructor.employee_name;
    	this.job_experience=copyconstructor.job_experience;
    }
	@Override
	public String toString() {
		return "CopyConstructor [employee_name=" + employee_name + ", job_experience=" + job_experience + "]";
	}
	public static void main(String[] args) {
       CopyConstructor c=new CopyConstructor("Harshini",3.5f);
       CopyConstructor c2= new CopyConstructor(c);
       System.out.println("C1 values :"+c);
       System.out.println("C2 values :"+c2);
	}


}
