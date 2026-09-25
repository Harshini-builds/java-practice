package arrays;

/*
 * Program: To print the element of array
 */
import java.util.Scanner;
public class PrintArrayElements {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of array ");
    int arr_length=Integer.parseInt(scan.nextLine());
    int arr[]=new int[arr_length];
    System.out.println("Enter elements ");
    for(int i=0;i<arr_length;i++) {
    	arr[i]=Integer.parseInt(scan.nextLine());
    }
    System.out.println("Elements of an array :");
    for(int i=0;i<arr_length;i++) {
    	System.out.print(arr[i]+" ");
    }
	}

}
