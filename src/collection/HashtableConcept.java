package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 

import java.util.HashMap;

public class HashtableConcept {

	/**
	 * Its similar to Hashmap but Its Synchronized- Multiple thread can't work on it simultenoulsy.
	 * its store entry in the key and value.
	 * Keys are object in the hashtable, o=and hashtable store keys as hashCode.
	 * no null and null values are allowed.
	 * Used enumeration to traverse the values. also use setEntry().
	 */
	public static void main(String[] args) {

		Hashtable h=new Hashtable();
		h.put(101, "Bangalore");
		h.put(102, "Dehradoon");
		h.put(103, "Delhi");
		System.out.println(h);
		System.out.println(h.get(101));
		
		Enumeration e= h.elements();
		System.out.println("Using enumeration");
		while(e.hasMoreElements())
		{
			System.out.println("The values are here: "+ e.nextElement());
			System.out.println("The values are here: "+ e.getClass());
			
		}
		
		Set s=h.entrySet();
		System.out.println("Set size: "+s.size());
		Iterator itr=s.iterator();
		System.out.println("Using Iterator");

		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101," ajay"); 
        ht.put(101,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 

	}

}
