package collection;

import java.util.LinkedList;

/* Linked list underlying data structure is double linked list.
 * 
 * 
 * 
 */

/**
 * @author Prem Singh
 *
 */

public class LinkedListConcept {

	
	
	public static void main(String[] args) {
		
		LinkedList< String> ll=new LinkedList<String>();
		ll.add("One");
		ll.add("Second");
		ll.add("Three");
		ll.add("Four");
		ll.add("Five");
		System.out.println("Linked list items: "+ll);
		//add in index number
		ll.add(2, "after second");
		System.out.println("Linked list items after added one more: "+ll);
		
		//addFirst
		
		ll.addFirst("before one");
		
		//addlast
		ll.addLast("after last element");
		System.out.println("Linked list items after added first and last : "+ll);

		//removeFirst
		ll.removeFirst();
		//removeLast
		ll.removeLast();
		System.out.println("Linked list items after removing first and last : "+ll);
		//remove first element
		ll.remove();
		System.out.println("Removed : "+ll);
		
		 
		



	}

}
