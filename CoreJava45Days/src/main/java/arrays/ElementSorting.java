package arrays;

/*
 * Program: To sort elements in given array
 */
import java.util.Scanner;

public class ElementSorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    for(int j=0;j<arr_length-1;j++) {
	    	for(int k=0;k<arr_length-1-j;k++) {
	    	if(arr[j]>arr[j+1]) {
	    	int temp=arr[j+1];
	    	arr[j+1]=arr[j];
	    	arr[j]=temp;
	    	}
	    	}
	    }
	    for(int sortedelements :arr) {
	    	System.out.print(sortedelements+" ");
	    }
	}

}
