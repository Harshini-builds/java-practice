package arrays;

/*
 * Program:To print the largest element of an array
 */
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter length of array ");
    int arr_length=Integer.parseInt(scan.nextLine());
    int arr[]=new int[arr_length];
    System.out.println("Enter elements ");
    for(int i=0;i<arr_length;i++) {
    	arr[i]=Integer.parseInt(scan.nextLine());
    }
    int largest_element=arr[0];
    for(int i=0;i<arr_length;i++) {
    	if(arr[i]>largest_element) {
    		largest_element=arr[i];
    	}
    }
    
    System.out.println("Largest element of array is :"+largest_element);
	}

}
