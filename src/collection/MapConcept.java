package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



/**
 * @author Prem Singh
 * 
 * 
 *map is part of Map family and it has 3 Interface and 4 classes
 *Interface are: Map, SortedMap, NavigableMap
 *Classes are: HashTable, HashMap, LinkedHashMap and TreeSet
 *It store the entry(element) in key and value pairs. Key is always unique.
 *Map<key, value>
 *A Map is useful if you have to search, update or delete elements on the basis of a key.
 * HashMap is class and implements Map.
 * Extends AbstractMap
 * It contains only unique values.
 * It may have one null key  and multiple null values.
 * It maintains no values.
 * VVI- Non-synchronized- more than one thread can access so that performance will increased.
 * fail fast condition -> concurrent modification exception- any thread change anything it will not work.
 * for traverse used Entry and entrySet().
 * If previously inserted any value it will just update the same value again no duplicate entry allowed.
 * setEntry()-Returns a Set view of the mappings contained the map. The method returns a set having same elements as the hash map.
 * Map.Entry interface in Java provides certain methods to access the entry in the Map. By gaining access to the entry of the Map we can easily manipulate them. Map.Entry is a generic and is defined in the java.util package.


 * Entry will hold the value of what setEntry will ret

 */
public class MapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//put(K, V) method
		hm.put(1, "Prem");
		hm.put(2, "Shuchi");
		hm.put(3, "Prem");
		hm.put(1, "Prem");
		System.out.println(hm);
	
		for(Entry<Integer, String> e : hm.entrySet())
		{
			int key=e.getKey();
			String value=e.getValue();
			System.out.println("Key: "+key +" And value: "+value);
			
		}
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.getOrDefault("Default "+ 1, "f"));
		
		System.out.println(hm.remove(3));
		
		System.out.println("************* After removing the entry********");
		for(Entry<Integer, String> e : hm.entrySet())
		{
			int key=e.getKey();
			String value=e.getValue();
			System.out.println("Key: "+key +" And value: "+value);
			
		}
		
		System.out.println("************* advance loop********");
		
		
		

	}

}
