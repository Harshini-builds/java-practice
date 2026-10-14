package recursion;

/*
 * Program:To print the sum of digits from given number
 */
public class SumOfGivenNumber {
static int givenNumberSum(int n) {
	if(n==0) {
		return 0;
	}
	return n%10+givenNumberSum(n/10);
}
	public static void main(String[] args) {
	System.out.println("Sum of given number :"+givenNumberSum(12345));
	}

}
