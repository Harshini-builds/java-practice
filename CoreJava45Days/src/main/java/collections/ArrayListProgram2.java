package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListProgram2 {

	public static void main(String[] args) {
		ArrayList <Food>food=new ArrayList<Food>();
         food.add(new Food(101,"Chicken Dum Briyani",235.0));
         food.add(new Food(102,"Chicken Fry Briyani",270.9));
         food.add(new Food(103,"Chicken 65 Briyani",250.0));
         food.add(new Food(104,"Chicken Lollipop Briyani",240.0));
         food.add(new Food(105,"Mutton Dum Briyani",350.0));
         food.add(new Food(106,"Nalli Ghosh Briyani",450.0));
         food.add(new Food(107,"Chicken chukka Briyani",300.0));
         System.out.println("---------------- Menu------------------ ");
         Iterator <Food> i=food.iterator();
         while(i.hasNext()) {
        	 System.out.println(i.next()+" ");
         }
         System.out.println("Removing object of food at index 2:"+food.remove(2));
      System.out.println("Comparing Address of 2 food object :"+(food.get(2)==(food.get(4))));
      System.out.println("HashCode of food object :"+(food.get(1).hashCode()));
      System.out.println("-------------------------------------------------------------");
      System.out.println("Reteriving items using for -loop  after performing operations :\n");
      for(int j=0;j<food.size();j++) {
    	  System.out.println(food.get(j)+" ");
      }
      System.out.println(food.get(1).getFood_name()+"     ₹"+food.get(1).getFood_price());
      
	}
	
	

}
