package arrays;

/*
 * Program: To print non repeative elements from given array
 */
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	   
	    
	    for(int i=0;i<arr_length;i++) {
	    int number=Integer.parseInt(scan.nextLine());
	    	arr[i]=number;
	    }
	    Arrays.sort(arr);
	      int left=0;
	      for(int right=1;right<arr_length;right++) {
	    	  if(arr[right]!=arr[left]) {
	    		  left++;
	    		  arr[left]=arr[right];
	    	  }
	    	  
	      }
	      for(int i=0;i<=left;i++) {
	    	  System.out.print(arr[i]+" ");
	      }
	}

}
