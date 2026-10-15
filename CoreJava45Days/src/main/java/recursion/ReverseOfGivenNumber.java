package recursion;

/*
 * Program:To print the reverse of given number
 */
public class ReverseOfGivenNumber {
static int reverseNumber(int n,int rev) {
	if(n==0) {
		return rev;
	}
	
	return reverseNumber(n/10,rev*10+n%10);
}
	public static void main(String[] args) {
		System.out.println("Reverse of given number is :"+reverseNumber(12984,0));

	}

}
