package recursion;

/*
 * Program: To print sum of numbers from  1 to N using recursion
 */
public class SumOfNumbers {
static int sum(int n) {
	if(n==0) {
		return 0;
	}
	return n+sum(n-1);
}	
	public static void main(String[] args) {
	System.out.println("Sum of number :"+sum(10));

	}

}
