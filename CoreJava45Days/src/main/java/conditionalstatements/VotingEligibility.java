package conditionalstatements;

/* 
 * Program: Write a program to check the voting eligibility
 */
import java.util.Scanner;
public class VotingEligibility {
	
Scanner scan=new Scanner(System.in);

	public void eligibility() {
		System.out.println("Enter your name :");
		String name=scan.nextLine();
		System.out.println("Enter your age : ");
		int age=scan.nextInt();
		System.out.println("===================================");
		System.out.println("Voting Eligibility ");
		System.out.println("===================================");
		if(age>=18&&age<=100) {
			System.out.println("Name :"+name);
			System.out.println("Age :" +age);
			System.out.println("Congratulations "+name+" !");
			System.out.println("Your are eligible to vote ");
		}
		else if(age>0&&age<18) {
			System.out.println("Name :"+name);
			System.out.println("Age :" +age);
			System.out.println("Sorry "+name+"!");
			System.out.println("You are not eligible to vote , you can vote after "+(18-age) +" years ");
		}
		else {
			System.out.println("Invalid age check and re-enter again !");
		}
		scan.close();
	}
	
	public static void main(String[] args) {
	VotingEligibility votingeligibility=new VotingEligibility();
	votingeligibility.eligibility();
	}

}
