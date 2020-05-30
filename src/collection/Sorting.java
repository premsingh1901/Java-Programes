package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Prem Singh
 * This program is sort the string in list
 *
 */
public class Sorting {
	

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("Prem");
		list.add("Amit");
		list.add("Suri");
		list.add("Aayush");
		list.add("Ghar");
		System.out.println("Before sort sorted:"+ list);

		
		Collections.sort(list);
		System.out.println("After Sort String : "+list);
		
		List listInt=new ArrayList();
		listInt.add(10);
		listInt.add(50);
		listInt.add(20);
		listInt.add(40);
		listInt.add(30);
		System.out.println("Before sort sorted:"+ listInt);


		Collections.sort(listInt);
		System.out.println("After Sort String : "+listInt); 
		
		
		String []arr=new String[5];
		arr[0]="Prem";
		arr[1]="Singh";
		arr[2]="Nari";
		arr[3]="Zebra";
		arr[4]="Aj";
		System.out.println("Before sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("After sorting: ");

		
		List listArr=Arrays.asList(arr);
		Collections.sort(listArr);
		System.out.println(listArr);


	}

}
