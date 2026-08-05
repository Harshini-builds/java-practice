package conditionalstatements;

/*
 * Program :WAP to categorize a person based on age
 */
import java.util.Scanner;
public class AgeCategory {
Scanner scan=new Scanner(System.in);
	public void displayCategory() {
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("===================================");
		System.out.println("Age Category");
		System.out.println("===================================");
		if(age>0&&age<=12)
			System.out.println("Category : Child ");
		else if(age>=13&&age<=19)
			System.out.println("Category : Teenager");
		else if(age>=20&&age<=59)
			System.out.println("Category : Adult");
		else if(age>=60&&age<=100)
			System.out.println("Category : Senior Citizen");
		else
			System.out.println("Invalid age ! Please check and re-enter correctly");
		scan.close();
	}
	public static void main(String[] args) {
		AgeCategory agecategory=new AgeCategory();
		agecategory.displayCategory();

	}

}
