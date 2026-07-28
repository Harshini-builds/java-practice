package basics;

/* Program :Type Casting 
 * Objective: Converting one data type into another 
 */
public class TypeCasting {

	public static void main(String[] args) {
		byte b=125;
		int i=300;  
		float f=125.6f;
		long l=7671825;
		double d=165900043.5671;
		 System.out.println("=============================");
        System.out.println("Explicit type casting ");
        System.out.println("=============================");
		System.out.println("byte :"+(b=(byte)i));
		System.out.println("int :"+(i=(int)l));
		System.out.println("float:"+(f=(float)d));
		 System.out.println("\n\n=============================");
		System.out.println("Implicit type casting");
		 System.out.println("=============================");
		System.out.println("int :"+(i=(byte)b));
		System.out.println("long :"+(l=(long)i));
		System.out.println("double :"+(d=(double)f));
		
	}

}
