package recursion;
/*
 * Program:To print the count from gicen number
 */
public class CountOfDigits {
static int countOfGivenNumber(int n) {
	
	if(n==0) {
		return 0;
	}
	
	
	return 1+countOfGivenNumber(n/10);
}
	public static void main(String[] args) {
	System.out.println("Count of given number is :"+countOfGivenNumber(23984));

	}

}
