package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListProgram1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        ArrayList <Integer>al=new ArrayList<Integer>();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(30);
       al.add(50);
       System.out.println("Array list elements before performing operations :");
       
       for(int i=0;i<al.size();i++) {            // retriving elements using for-loop
    	   System.out.print(al.get(i)+" ");//-> gets the element at specified index 
       }
       al.add(2,25);//index,value-> Sets particular value at specified index
       
       System.out.println("Is the element 30 present in arraylist(al):"+al.contains(30));//-> checks the element and returns true if it is present in arraylist or false
       System.out.println("Index of element 50 :"+al.indexOf(50));
     al.remove(Integer.valueOf(40));//->removes the specified element
     
     System.out.println("------------------------------------------------------------------");
     System.out.println("\nReteriving Arraylist elements using for -each after performing operations:");
      for(Integer elements:al) {
    	  System.out.print(elements+" ");
      
	}
      System.out.println("\n------------------------------------------------------------------");
      ArrayList <Integer>al2=new ArrayList<Integer>();
      al2.add(35);
      al2.add(45);
      al2.add(55);
      al.addAll(al2);
     
      System.out.println("\nIs ArrayList(al2) elements present in ArrayList(al):"+al.containsAll(al2));
      System.out.println("Reteriving the ArrayList elements using iterator interface after adding al1 into al2");
      
      Iterator <Integer>i=al.iterator();
      
      while(i.hasNext()) {
    	  System.out.print(i.next()+" ");
      }
   // al.removeAll(al)// used to remove the elements of arraylist2 which are in arraylist1
	}
}
