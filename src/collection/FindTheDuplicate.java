package collection;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {

	public static void main(String[] args) {

		int []arr= {10,20,30,40,50,60,10,20,30,40};
		Set hsDuplicate=new HashSet();

		Set hs=new HashSet();
		
		for(int i=0;i<arr.length;i++)
		{
			boolean getAdded=hs.add(arr[i]);
			if(getAdded==false)
				hsDuplicate.add(arr[i]);
		
			
		}
		System.out.println("Non duplicate values are: "+ hs);
		System.out.println("Duplicate values are: "+ hsDuplicate);

	}

}
