package patterns;

/*
 * Program:WAP to print right angle triangle pattern
 */
public class RightAngleTrainglePatterrn {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
