package collections;

/*
 * Program:To perform operations using user defined class on HashSet
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetProgram2 {

	public static void main(String[] args) {
		Set<SubscriberManager> details = new HashSet<>();
		System.out.println(details.add(new SubscriberManager(1, "Govind", "govind@gmail.com", "PREMIUM")));
		System.out.println(details.add(new SubscriberManager(2, "SreeDevi", "sree@gmail.com", "FREE")));
		System.out.println(details.add(new SubscriberManager(3, "Vamana", "vamana@gmail.com", "BASEPLAN")));
		System.out.println(details.add(new SubscriberManager(4, "Radhima", "radhima@gmail.com", "PREMIUM")));
		System.out.println(details.add(new SubscriberManager(5, "Rudra", "rudra@gmail.com", "PREMIUM")));

		if (!details.add(new SubscriberManager(1, "Govind", "govind@gmail.com", "PREMIUM"))) {

			System.out.println("Subscriber Details Already added");
		}

		System.out.println("Reteriving Subscriber Manager details using for-each loop :");
		System.out.println("----------------------------------------------------------");
		for (SubscriberManager subscriberManager : details) {
			System.out.println(subscriberManager + " ");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Size of set before adding list :" + details.size());
		List<SubscriberManager> l = new ArrayList<>();
		l.add(new SubscriberManager(6, "Sita", "sita@yahoo.com", "PREMIUM"));
		l.add(new SubscriberManager(4, "Lakshmi", "lakshmi@gmail.com", "PREMIUM"));
		l.add(new SubscriberManager(5, "ASVITH", "asvith@gmail.com", "FREE"));
		System.out.println("Adding list elements into set :" + details.addAll(l));
		System.out.println("Reteriving Subscriber Manager details After adding list elements to set using iterator :");
		System.out.println("----------------------------------------------------------");
		Iterator<SubscriberManager> i = details.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Size of set after adding list :" + details.size());
		System.out.println("Seperating all list elements from set :" + details.retainAll(l));
		System.out.println("Size of set after retaining list :" + details.size());

	}

}
