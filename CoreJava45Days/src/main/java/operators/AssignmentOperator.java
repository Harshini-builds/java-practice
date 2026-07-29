package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
                  int x=5;
                  System.out.println("=================================");
                  System.out.println("Assignment Operators ");
                  System.out.println("=================================");
                  System.out.println("Intial X value :"+x);
                  System.out.println("X value after +="+(x+=5));// Perform Addition and reassigns again into the variable
                  System.out.println("X value after -="+(x-=3));// Subtraction
                  System.out.println("X value after *="+(x*=15));//Multiplication
                  System.out.println("X value after /="+(x/=5));//Division
                  System.out.println("X value after %="+(x%3));//Modulus Division
	}

}
