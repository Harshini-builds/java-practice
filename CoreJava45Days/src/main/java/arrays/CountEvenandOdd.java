package arrays;

import java.util.Scanner;

public class CountEvenandOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	    for(int i=0;i<arr_length;i++) {
	    	arr[i]=Integer.parseInt(scan.nextLine());
	    }
	    int even_count=0;
	    int odd_count=0;
	    for(int element:arr) {
	    	if(element%2==0) {
	    		even_count++;
	    	}
	    	else {
	    	odd_count++;
	    	}
	    }
	    System.out.println("Even numbers count in :"+ even_count +" and Odd number "+odd_count);
	  
	}
	

}
