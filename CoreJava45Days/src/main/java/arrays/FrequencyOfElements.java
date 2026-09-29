package arrays;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of array ");
	    int arr_length=Integer.parseInt(scan.nextLine());
	    int arr[]=new int[arr_length];
	    System.out.println("Enter elements ");
	  int visited[]=new int[arr_length];
	    
	    for(int i=0;i<arr_length;i++) {
	    int number=Integer.parseInt(scan.nextLine());
	    arr[i]=number;
	    }
	    int target=0;
	    int count;
	    for(int i=0;i<arr_length;i++) {
	    	
	    	if(visited[i] == 1)
	            continue;
	    	
	    	target=arr[i];
	    	count=0;
	    for(int j=0;j<arr_length;j++) {
	    	if(target==arr[j]) {
	    		count++;
	    		visited[j] = 1;
	    	}
	    }
	    System.out.println("Count of "+target+" is "+count);
	    }
	}

}
