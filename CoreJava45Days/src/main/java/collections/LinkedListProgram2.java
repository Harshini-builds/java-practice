package collections;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram2 {

	public static void main(String[] args) {
		LinkedList<Page> page=new LinkedList <Page>();
		page.add( new Page("YouTube", "https://www.youtube.com"));
		page.addFirst(new Page("Home", "https://www.google.com"));
		page.add(new Page("GitHub", "https://www.github.com"));
		page.add(new Page("Naukri", "https://www.naukri.com"));
		page.addLast(new Page("LinkedIn", "https://www.linkedin.com"));
	
		System.out.println("Retrieving element from linkedlist in forward direction :");
		Iterator<Page> i=page.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------------------------------------");
	ListIterator<Page> history=page.listIterator();
	
	System.out.println("Retriving elements from linked list in reverse order :");
	ListIterator<Page> reverseorder=page.listIterator(page.size());
	while(reverseorder.hasPrevious()) {
		System.out.println(reverseorder.previous());
		
	}

	}

}
