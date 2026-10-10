package collections;

/*
 * Program: To add,remove and form operations on HashSet
 */
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetProgram1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		System.out.println("First null value :" + set.add(null));
		System.out.println(set.add(3));
		System.out.println("Trying to add second null value to set :" + set.add(null));
		System.out.println("Set values :");
		System.out.println("-----------------------------");
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\n-----------------------------");
		System.out.println("\nSize of set :" + set.size());
		System.out.println("Set is empty or not :" + set.isEmpty());
		System.out.println("Set contains null value or not :" + set.contains(null));
		System.out.println("Removing element 4 from set :" + set.remove(4));
		System.out.println("Adding collection of elements to set :" + set.addAll(Arrays.asList(4, 3, 6)));
		System.out.println("Reteriving elements from set using for -loop");
		System.out.println("-----------------------------");
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}
		System.out.println("\n-----------------------------");
		System.out.println("Retaining specified elements from set :" + set.retainAll(Arrays.asList(2, 4)));
		System.out.print("\nSet After retaining values from set :" + set);
		set.clear();
		System.out.println("\nSet size :" + set.size());
		System.out.print("Set After clearing elements :"+set);//Empty set
		// because no elements in set
	}

}
