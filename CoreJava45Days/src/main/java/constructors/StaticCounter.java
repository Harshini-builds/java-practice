package constructors;

/*
 * 
 */
public class StaticCounter {
	String name;
	int age;
	float marks;
	static int count_of_students=0;
	public StaticCounter(String name,int age,float marks) {
		this.name=name;
		this.age=age;
		this.marks=  marks ;
		count_of_students++;
	}
	public void displayDetails() {
		System.out.println("---------------- Student Details -------------------- ");
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);
	}
	public static int showCount() {
		return count_of_students;
	}
	public static void main(String[] args) {
		StaticCounter staticcounter1=new StaticCounter("Harshini",22,8.32f);
		StaticCounter staticcounter2=new StaticCounter("Pavani",19,8.31f);
		StaticCounter staticcounter3=new StaticCounter("Vinu's",4,4.10f);
		System.out.println("Students count ="+StaticCounter.showCount());
	}

}
