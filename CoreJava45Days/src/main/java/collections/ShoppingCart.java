package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
       Scanner scan=new Scanner(System.in);
	ArrayList<String> groceriesList=new ArrayList<>();
public String addGroceries() {
	System.out.println("Enter the grocery item name ");
	String item_name=scan.nextLine();
	if(groceriesList.contains(item_name)) {
		throw new RuntimeException("Grocery item already exists in the list ");
	}
	groceriesList.add(item_name);
	return item_name+ " added to cart";
}

public void checkGrocerieslist() {
	if(groceriesList.isEmpty()) {
		System.out.println("No items added  to the cart yet");
	}
	Iterator<String> i=groceriesList.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
public String removeItem() {
	System.out.println("Enter the grocery item name ");
	String item_name=scan.nextLine();
	if(!(groceriesList.contains(item_name))) {
		return item_name +"Grocery item not added in cart  ";
	}
	groceriesList.remove(groceriesList.indexOf(item_name));
	return item_name +" Item removed from cart" ;
}

public String searchForItem() {
	System.out.println("Enter the grocery item name ");
	String item_name=scan.nextLine();
	if(groceriesList.contains(item_name)) {
		return item_name+"Grocery item already exists in the list ";
	}
	return item_name+" Already added to cart ";
}
public int totalItems() {
	if(groceriesList.isEmpty()) {
		System.out.println("No items added  to the cart yet");
	}
	return (groceriesList.size());
}
	public static void main(String[] args) {
		ShoppingCart sc=new ShoppingCart();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Welcome to Online Shopping Cart App");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Here you can easliy store and manage your groceries list easliy ");
		while(true) {
		System.out.println("1.Add Groceries \n 2.Check Groceries List\n 3.Remove Item from list \n 4.Search for Product \n 5.Total items \n 6.Exit");
		System.out.println("Enter your choice ");
		int choice=sc.scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println(sc.addGroceries()+"\n\n\n")
;
			break;
		case 2:
		sc.checkGrocerieslist();
		break;
		case 3:
			System.out.println(sc.removeItem()+"\n\n\n");
		    break;
		case 4:
			System.out.println(sc.searchForItem()+"\n\n\n");
			break;
		case 5:
			System.out.println(sc.totalItems()+"\n\n\n");
			break;
		case 6:
			System.out.println("Thanks for visiting Online Shopping Cart");
			System.exit(0);
			break;
			default:
				System.out.println("Enter the choice number correctly ");
		}
		
		}
	}

}
