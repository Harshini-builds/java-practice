package conditionalstatements;
/* 
 * Program :WAP to find Result of Student 
 */
import java.util.Scanner;
public class PassOrFail {
Scanner scan=new Scanner(System.in);
public void result() {
	System.out.println("Enter student name");
	String name=scan.nextLine();
	System.out.println("Enter marks ");
	int marks=scan.nextInt();
	System.out.println("=======================================");
	System.out.println("Student Result ");
	System.out.println("=======================================");
	System.out.println("Student Name :"+name);
	System.out.println("Marks :"+marks);
	if(marks<0||marks>100){
		System.out.println("Invalid marks");
	}
	else if (marks>=35&&marks<=100){
        System.out.println("Result : PASS ");
        System.out.println("Congratulations "+name+ " !");
	}
	else {
		System.out.println("Result : FAIL");
		System.out.println("SORRY "+name+ "!");
	}
}
	public static void main(String[] args) {
		PassOrFail passorfail =new PassOrFail();
		passorfail.result();

	}

}
