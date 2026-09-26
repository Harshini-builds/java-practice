package arrays;

/*
 * Program:To find second largest number in given array
 */
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    int first_largest=arr[0];
	    int second_largest=arr[1];
	    for(int i=2;i<arr.length;i++) {
       if(arr[i]>first_largest) {
    	   second_largest=first_largest;
    	   first_largest=arr[i];
       }
       else if(arr[i]>second_largest) {
    	   second_largest=arr[i];
       }
	}
	    System.out.println("Second largest element in given array :"+second_largest);
	}
}
