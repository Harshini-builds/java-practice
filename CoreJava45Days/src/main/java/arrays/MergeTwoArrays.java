package arrays;

/*
 * Program: To merge arrays 
 */
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter length of Array1 ");
	    int arr1_length=Integer.parseInt(scan.nextLine());
	    int arr1[]=new int[arr1_length];
	    System.out.println("Enter elements for Array1");
	    for(int i=0;i<arr1_length;i++) {
	    	arr1[i]=Integer.parseInt(scan.nextLine());
	    }
	    
	    System.out.println("Enter length of Array2 ");
	    int arr2_length=Integer.parseInt(scan.nextLine());
	    int arr2[]=new int[arr2_length];
	    System.out.println("Enter elements for Array2 ");
	    for(int j=0;j<arr2_length;j++) {
	    	arr2[j]=Integer.parseInt(scan.nextLine());
	    }
	    
	    int merge[]=new int[arr1_length+arr2_length];
	    
	    for(int m=0;m<arr1_length;m++) {
	    	merge[m]=arr1[m];
	    }
	    
	   
	    for(int n=arr1_length;n<merge.length;n++) {
	    	merge[n]=arr2[n-arr1_length];
	    	
	    }
	   
	   
	   for(int meregeelements:merge) {
		   System.out.print(meregeelements+" ");
	   }

	}

}
