package arrays;

/*
 * Program:To check whether given element is in array or not
 */
import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    System.out.println("Enter a number to check whether it is in array or not");
	    int find_element=Integer.parseInt(scan.nextLine());
	     boolean result=false;
	    for(int elements:arr) {
	    	if(elements==find_element) {
	    		result=true;
	    	}
	    }
	    if(result) 
	    	System.out.println("Element "+find_element+" Found ");
	    
	    else 
	    	System.out.println("Element "+find_element+" Not Found ");
	    
	    
	
	}
}
