package collections;


import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListProgram1 {

	public static void main(String[] args) {
		
		LinkedList <String> llist=new LinkedList<String>();  //"google.com", "youtube.com", "gmail.com", "github.com", "linkedin.com"
         llist.add("google.com");
         llist.add("youtube.com");
         llist.add("gmail.com");
         llist.add("github.com");
         llist.add("linkedin.com");
         
         System.out.println("Printing the browsers list :");
         for(int i=0;i<llist.size();i++) {
        	 System.out.println(llist.get(i));
         }
         llist.addFirst("homepage");
         llist.add(3,"Stackoverflow.com");
         llist.addLast("news.com");
     System.out.println("Check wheather the linked list contains github.com or not :"+llist.contains("github.com"));//returns boolean
     
     System.out.println("-----------------------------------------------");
     System.out.println("Reteriving elements using iterator :");
    Iterator i=llist.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next()+" ");
    }
	}

}
