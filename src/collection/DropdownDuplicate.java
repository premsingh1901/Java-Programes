package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DropdownDuplicate {

	public static void main(String[] args) {
		
		 List list=new ArrayList();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 list.add("d");
		 list.add("e");
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 System.out.println("Duplicate List: "+ list);
		 HashSet set=new HashSet();
		for(Object o:list)
		{
			set.add(o);
			
		}
		
		 System.out.println("Non duplicate List: "+ set);
		 
//Find the duplicate in the list.
		 System.out.println("Duplicate List again: "+ list);
		 Set listDup=new HashSet();
		 Object[] arr=list.toArray();
		 System.out.println("Size of the array: "+arr.length);
		 for(int i=0;i<arr.length;i++)
		 {
			 int count=0;
			 for(int j=0;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
					 count++;
			 }
			 if(count>1)
			 {
				listDup.add(arr[i]);
			 }
			 
		 }

		 System.out.println("Only duplicate by converting in Array : "+ listDup);
		 
		 //Removing the duplicate Using list only
		 List newList=new ArrayList();
		 List newListDupli=new ArrayList();

		 for(Object c:list)
		 {
			 if(!newList.contains(c))
				 newList.add(c);
			 else
				 newListDupli.add(c);
				 
		 }
		 System.out.println("Removing the duplicate Using list only :"+newList);
		 System.out.println("Duplicate values in the list :"+newListDupli);

	}

	
	
}
