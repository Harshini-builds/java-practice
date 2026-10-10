package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram1 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Home");
		set.add("Profile");
		set.add(null);
		set.add("Courses");
		set.add("Cart");
		System.out.println("Adding one more null value to set :" + set.add(null));
		boolean isAdded = set.add("Cart");
		if (!isAdded) {
			System.out.println("Duplicate values are not allowed already added in set !");
		}
		System.out.println("\nReteriving elements from LinkedHashSet using for-each");
		System.out.println("------------------------------------------------------------------------");
		for (String value : set) {
			System.out.print(value + " ");
		}
		System.out.println("\n------------------------------------------------------------------------");
		Set<String> hashset = new HashSet<>();
		hashset.addAll(set);
		Iterator<String> i1 = set.iterator();
		Iterator<String> i2 = hashset.iterator();
		int num = 1;
		System.out.println("\nReteriving elements from both LinkedHashSet set and Set using Iterator");
		System.out.println("------------------------------------------------------------------------");
		while (i1.hasNext() && i2.hasNext()) {
			System.out.println(num + "." + i1.next() + "      " + i2.next());
			num++;
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\nChecking whether set contains Cart or not :" + set.contains("Cart"));
		System.out.println("LinkedHashSet size :" + set.size());
		System.out.println("Removing Course from LinkedHashSet :" + set.remove("Courses"));
		System.out.println("LinkedHashSet after performing bsic operations :" + set);

	}

}
