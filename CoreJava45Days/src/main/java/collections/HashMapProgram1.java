package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class HashMapProgram1 {

	public static void main(String[] args) {
	Map<Integer,String>m=new HashMap<Integer,String>();
	m.put(1,"Harshini");
	m.put(2,"Sri Devi");
	m.put(3,"Durga");
	m.put(4,"Sree");
	m.put(5, "Pavani");
	m.put(6, "Madhu");
	m.put(7, "Govinda");
	
	
	System.out.println("Getting value by passing key :"+m.get(3));
	System.out.println(m.containsKey(8));
	System.out.println(m.containsValue("Vama"));
	System.out.println(m);
	System.out.println("-------------------------------------------");
	for (Entry<Integer, String> e : m.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}

	}

}
