package excepetionhandling;

import java.util.Scanner;
public class VoterAgeVerification {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Enter your age");
		int age=Integer.parseInt(scan.nextLine());
		try {
			if(age<=0||age>100) {
				throw new CustomException(name+",Enter the correct age !!!");
			}
			if(age>=18&&age<=100) {
				System.out.println(name+" , you are Eligible to Vote");
			}
			if(age>0&&age<18) {
				throw new CustomException(name+" ,You have to wait "+(18-age)+"years to vote");
			}
		}
		catch(Exception e) {
			System.out.println("You are not eligibile to Vote !!! \n"+e.getMessage());
		}
		finally {
			System.out.println("Thank you for visiting Vote Verification Portal !!! ");
		}
	}

}
