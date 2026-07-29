package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int age=21;
		boolean eligibleToVote=true;
		System.out.println("===========================");
		System.out.println("Logical Operators ");
		System.out.println("===========================");
		System.out.println((age>=18) && eligibleToVote);// returns true when both conditions true
		System.out.println((age<18) || eligibleToVote);// returns true if one of condition is true 
		System.out.println(! eligibleToVote);// returns the opposite boolean result

	}

}
