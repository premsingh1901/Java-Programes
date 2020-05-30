package collection;

import java.util.HashMap;
import java.util.Map.Entry;


public class FrequencyOfChar {

	public static void main(String[] args) {

		String s="Java is Java and its best";
		s.replaceAll(" ", "");
		char []charArr=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(charArr[i]==charArr[j]&& charArr[i]!=' ')
				{
					count++;
				}
			}
			if(count>=1)
			hm.put(charArr[i], count);
		}
		
		System.out.println(hm);
		hm.entrySet();
		for(Entry<Character, Integer> e : hm.entrySet())
		{
			char c=e.getKey();
			int i=e.getValue();
			System.out.println("Char is: "+ c +" and Number of occurence is: "+ i);
		}

		

		
	}

}
