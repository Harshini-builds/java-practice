package arrays;

/*
 *  Program: To print sum of elements 
 */
import java.util.Scanner;
public class SumandAverageOfElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter array length");
       int arr_length=Integer.parseInt(scan.nextLine());
       int arr[]=new int[arr_length];
       int sum=0;
      
       System.out.println("Enter elements ");
       for(int i=0;i<arr_length;i++) {
    	   arr[i]=Integer.parseInt(scan.nextLine());
    	   sum+=arr[i];
       }
       System.out.println("Elements of array ");
       for(int elements:arr) {
    	   System.out.print(elements +" ");
       }
      
       System.out.println("\nSum of elements :"+sum);
       System.out.println("Average od elements :"+(double)(sum/arr_length));
	}

}
