package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Prem Singh
 * we can convert Array to List
 *
 */
public class ArrayToList {

	
	   public static void main(String args[]) {
	     
	      Integer []arr=new Integer[5];
	      arr[0]=10;
	      arr[1]=20;
	      arr[2]=30;
	      arr[3]=40;
	      arr[4]=50;

	      for(int i=0;i<arr.length;i++)
	      System.out.println(" Arrays Elements : "+arr[i]);

	      
	      List list = Arrays.asList(arr);          
	      System.out.println(list);
	      
	      
	      
	        }  
	}
