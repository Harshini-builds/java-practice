package collections;

public class Student {
 
	private int s_id;
	private String s_name;
	private double s_marks;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public double getS_marks() {
		return s_marks;
	}
	public void setS_marks(double s_marks) {
		this.s_marks = s_marks;
	}
	public Student(int s_id, String s_name, double s_marks) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_marks = s_marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_marks=" + s_marks + "]";
	}
	
}
