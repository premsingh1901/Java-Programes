package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DuplicateRemove {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Prem");
		l.add("Shuchi");
		l.add("Prem");
		l.add("Prem");
		l.add("Shuchi");
		l.add("Rana Jee");
		l.add("Bisht Jee");
		l.add("Bisht Jee"); 
				
		for(int i=0; i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("***********For Each loop**************");
		for(String s:l)
		{
			System.out.println(s);

		}

		System.out.println("***********Iterator**************");
		Iterator<String> itr= l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		HashSet<String> h=new HashSet<String>();
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equalsIgnoreCase(l.get(j)))
				{
					//System.out.println(l.get(i)+" is duplicate");
					
					h.add(l.get(i));
				}
				 
			}
		}
		
		
		System.out.println("Duplicat are:"+ h);
		
		HashSet<String> h1=new HashSet<String>();
		for(int i=0;i<l.size();i++)
		{
			h1.add(l.get(i));
		}
		
		System.out.println("No Duplicate "+h1 +""+l.size());

		
		
		

	}

}
