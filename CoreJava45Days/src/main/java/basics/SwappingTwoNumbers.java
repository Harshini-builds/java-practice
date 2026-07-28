package basics;

/* Program : Swapping Two variables 
 * Objective: Swapping two variables without using the third variable
 */
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		
		System.out.println("=============================");
		System.out.println(" Values Before Swapping ");
		System.out.println("=============================");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("\n=============================");
		System.out.println("Values After swapping ");
		System.out.println("=============================");
		a=a+b;//80
		b=a-b;//80-50=30 -->b=30
		a=a-b;//80-30=50 -->a=50
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}

}
