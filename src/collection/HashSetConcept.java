 
package collection;

import java.util.HashSet;

public class HashSetConcept {

	/**
	 * When we want to represents group of individual object where duplicates are not allowed and insertion order not preserved. 
	 * set interface doesn't defined any new methods all Collection methods are available only.
	 * HashSet- the underlying data structure is Hashtable.
	 * All objects inserted based on HashCode of object.
	 * Heterogeneous objects are allowed.
	 * null is allowed.
	 * hashSet is best when frequent operation is search.
	 * Implements serilizable and clonable.
	 * default fill ratio - 0.75 it means when the set fill upto 75% then new set object will get created with new capacity.
	 *  
	 */
	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("Prem");
		hs.add("Suri");
		hs.add("Shuchi");
		hs.add("ruchi");
		System.out.println(" "+ hs.size()+" "+hs);
		for(String s:hs)
		{
			System.out.println("Items in hasSet: "+ s);
		}
		
		Object []arr=hs.toArray();
		System.out.println(arr.length);
		for(Object s1:arr)
		{
			System.out.println("Array items: " +s1);
			
		}
		
		
		
//		hs.clear();
//		System.out.println(" "+ hs.size()+" "+hs);

		
	}

}
