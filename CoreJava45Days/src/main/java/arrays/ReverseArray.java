package arrays;

/*
 * Program: To print the elements of array in reverse 
 */
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    System.out.println("Rverse array :");
	    for(int i=arr_length-1;i>=0;i--) {
	    	System.out.print(arr[i]+" ");
	    }

	}

}
