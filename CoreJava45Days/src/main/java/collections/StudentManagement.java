package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class StudentManagement {
	Scanner scan=new Scanner(System.in);
	LinkedList<Student>l=new LinkedList<>();

	public String addStudent() {
		System.out.println("Enter Student id");
		int s_id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Student name");
		String s_name=scan.nextLine();
		System.out.println("Enter Student Marks");
		double s_marks=scan.nextDouble();
		for(Student student:l) {
			if(student.getS_id()==s_id) {
				return "Student with "+s_id+" already exists ";
			}
		}
		l.add(new Student(s_id,s_name,s_marks));
		return "Student Data added Successfully";
	}
	
	public void displayAllStudents() {
		if(!(l.isEmpty())) {
			for(Student student:l) {
				System.out.println(student);
			}
		}
		else {
			System.out.println("No Student data added to the list yet");
			}
	}
	public String  searchStudentById() {
		System.out.println("Enter Student id");
		int s_id=scan.nextInt();
		for(Student student:l) {
			if(student.getS_id()==s_id) {
				System.out.println(student);
				return "Student Record Found";
			}
		}
		return "No Student Record Found with "+s_id ;
	}
	
	public String updateStudentById() {
		System.out.println("Enter Student id");
		int s_id=scan.nextInt();
		for(Student student:l) {
			if(student.getS_id()==s_id) {
				scan.nextLine();
				System.out.println("Enter Student name");
				String s_name=scan.nextLine();
				System.out.println("Enter Student Marks");
				double s_marks=scan.nextDouble();
				student.setS_name(s_name);
				student.setS_marks(s_marks);
				return "Student Record Updated Sucessfully";
			}
		}
		return "No Student Record Found with "+s_id ;
	}
	
	public String removeStudentById() {
		System.out.println("Enter Student id");
		int s_id=scan.nextInt();
		for(Student student:l) {
			if(student.getS_id()==s_id) {
			      l.remove(student);
				return "Student Record Removed Successfully";
			}
		}
		return "No Student Record Found with "+s_id ;
	}
	
	public void highestScoredStudent() {
		if(!(l.isEmpty())) {
			LinkedList<Double>marks = new LinkedList<>();
			for(Student student:l) {
				marks.add(student.getS_marks());
			}
			Collections.sort(marks);
			System.out.println(marks.getLast());
		}
		else {
			System.out.println("No Data added to the marks yet");
		}
	}
	public void firstStudent() {
		if(!(l.isEmpty())) {
			System.out.println(l.peek());
		}
		else {
		System.out.println("No Student data added to the list yet");
		}
	}
	
	public void lastStudent() {
		if(!(l.isEmpty())) {
			System.out.println(l.getLast());
			
		}
		else {
			System.out.println("No Student data added to the list yet");
			}
	}
	
	public int  totalStudents() {
		if(!(l.isEmpty())) {
			return l.size();
		}
		return 0;
	}
	public void marksSort() {
		if((l.isEmpty())) {
			System.out.println("No Student data added to the list yet");
		}
		LinkedList<Double>marks = new LinkedList<>();
			for(Student student:l) {
				marks.add(student.getS_marks());
			}
			Collections.sort(marks);
			System.out.println("Marks in Ascending Order");
			for(Double m:marks) {
				System.out.println(m);
			}
	}
	
	public static void main(String[] args) {
		StudentManagement s=new StudentManagement();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welcome to XYZ Schhol Students Portal");
		System.out.println("--------------------------------------------------------------------");

		while(true) {
		System.out.println("1.Add Student \n 2.Display All Students \n3.Search Student \n4.Update Student Data \n5.Remove Student"
				+ "\n6.Highest Score \n7.First Student \n8.Last Student\n9.Total Students \n10.Students Marks List \n11.Exit");
	     System.out.println("Enter your choice");
	     int choice= s.scan.nextInt();
	     switch(choice) {
	     case 1:
	    	 System.out.println(s.addStudent());
	    	 break;
	     case 2:
	    	 s.displayAllStudents();
	    	 break;
	     case 3:
	    	 System.out.println(s.searchStudentById());
	    	 break;
	     case 4:
	    	 System.out.println(s.updateStudentById());
	    	 break;
	     case 5:
	    	 System.out.println(s.removeStudentById());
	    	 break;
	     case 6:
	    	s.highestScoredStudent();
	    	 break;
	     case 7:
	    	 s.firstStudent();
	    	 break;
	     case 8:
	    	 s.lastStudent();
	    	 break;
	     case 9:
	    	 System.out.println(s.totalStudents());
	    	 break;
	     case 10:
	    	 s.marksSort();
	    	 break;
	     case 11:
	    	 System.out.println("Thanks for visting ");
	    	 System.exit(0);
	    	 break;
	    	 default:
	    		 System.err.println("You entered wrong choice check and re-enter again !!!");
	     }
		}
	}

}
