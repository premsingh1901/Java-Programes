package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
/*Collection-
	Its a framework- store and manipulate the objects. Readymade methods are available.
	Operation- we can do many operation like searching, insertion and deletion of objects.
	it has many interfaces and classes
	 
	 
Array list-
 -its dynamic array in nature
 - duplicate values are allowed.
 - it maintained insertion order.
 - its not sysncronized
 - random access is allowed because it stores the values on the basis of indexes.
 
  - addAll: add all the objects from the second list to first list.
  example: l1.addAll(l2)- l2 objects will get added to l1.
  
  - removeAll: remove the objects from the second list
  example: l1.removeAll(l2)- l2 objects will get removed.
  
   - retainAll: retain all the duplicate objects from the both list. 
     
  
  
	*/
	/**
	 * Default capaicity 10. 
	 * It has 6 Interface and 9 classes.
	 * Interface: Collection, List, Queue, Set, Dequeue, SortedSet
	 * Classes: ArrayList, LinkedList, Vector, stack, PriorityQueue, ArrayQueue, HashSet, LinkedHashSet, TreeSet
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Prem");
		a1.add("Shuchi");
		a1.add("Sweety");
		
				
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Prem");
		a2.add("Shuchi");
		a2.add("Myself");
		
		System.out.println("First List:");
		for(String a:a1)
		{
			System.out.println(a);
			
		}
		
		System.out.println("Second List:");
		for(String a:a2)
		{
			System.out.println(a);
			
		}
		
		System.out.println("Adding both List");
		a1.addAll(a2);
		for(String a:a1)
		System.out.println(a);
		
		
		System.out.println("Removing second List");
		
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Prem");
		a3.add("Shuchi");
		a3.add("Sweety");
		
		System.out.println("List a3:"+a3);	
		
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("Prem");
		a4.add("Shuchi");
		a4.add("Sweety");
		a4.add("new");
		System.out.println("List a4:"+a4);	

		a3.retainAll(a4);// how to find the duplicate value
		System.out.println("List a3:"+a3);	

		
		
		
		
		
		


	}

}
