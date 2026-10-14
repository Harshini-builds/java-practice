package recursion;

/*
 * Program: To find the factorial of given number using recursion
 */
public class Factorial {
	
static int  factorialOfNumber(int n) {
	
	if(n==0||n==1) {
		return 1;
	}
return n*factorialOfNumber(n-1);
	
}
	public static void main(String[] args) {
		System.out.println("Factorial of given number :"+factorialOfNumber(5) );

	}	

}
