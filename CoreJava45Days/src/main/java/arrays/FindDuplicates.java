package arrays;

import java.util.Scanner;
import java.util.HashSet;
public class FindDuplicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    HashSet<Integer> uniqueelements=new HashSet<Integer>();
	    System.out.println("Duplicate elements :");
	    for(int i=0;i<arr_length;i++) {
	    if(!(uniqueelements.contains(arr[i]))) {
	    	uniqueelements.add(arr[i]);
	    }
	    else {
	    	System.out.print(arr[i]+" ");
	    }
	    }

	}

}
