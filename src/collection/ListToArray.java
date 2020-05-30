package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Prem Singh
 * we can convert List(ArrayList and LinkedList) into array
 *
 */
public class ListToArray {

	
	   public static void main(String args[]) {
	     
	      List list = new ArrayList();   
	      list.add(10);
	      list.add(20);
	      list.add(30);
	      list.add(40);
	      list.add(50);
	      list.add("Prem");

	      System.out.println(" List Elements : "+list);
	      System.out.println(" List Elements : "+list);

	      
	      
	      Object[] arr=list.toArray();
	      System.out.println("Array List :"+arr[0]);
	      System.out.println("Array List :"+arr[1]);
	      System.out.println("Array List :"+arr[2]);
	      System.out.println("Array List :"+arr[5]);
	      

	  
	      

	        }  
	}
