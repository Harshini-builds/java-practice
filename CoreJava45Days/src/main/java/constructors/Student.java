package constructors;

public class Student{
	String name;
	int age;
	float marks;
	
	public Student(String name,int age,float marks) {
		this.name=name;
		this.age=age;
		this.marks=  marks ;
	}
	public void displayDetails() {
		System.out.println("---------------- Student Details -------------------- ");
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);
	}
		public static void main(String[] args) {
	Student student1=new Student("Harshini",22,8.32f);
	student1.displayDetails();
		
	}

}
