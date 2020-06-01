package javaprograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumericStringSort {
	public static void main(String[] args) {
	
		String[] myArray = {"10", "2", "30", "40", "8","1"};
		//String[] myArray = {"Prem", "Singh", "Diya", "Baati", "Happy","Apna"};
		System.out.println("Before sorting: "+Arrays.toString(myArray));
		/*
		 * Arrays.sort(myArray); System.out.println(Arrays.toString(myArray));
		 */
		
		/* Int type of value -- This method will work correctly.
		 * int []arrInt= {3,2,5,6,89,7,1,2,4}; Arrays.sort(arrInt);
		 * System.out.println(Arrays.toString(arrInt));
		 */
		
		
		
		int len=myArray.length;
		System.out.println("Length of the string is "+len);
		
	for(int i=0;i<len;i++)
	{
		int arrValue = Integer.parseInt(myArray[i]);
		for(int j=i+1;j<len;j++)
		{
			int arrValue1 = Integer.parseInt(myArray[j]);
			//System.out.println(myArray[i].compareTo(myArray[j]));
			if(arrValue>arrValue1)
			{
							
				String temp=""+arrValue;
				myArray[i]=""+arrValue1;
				myArray[j]=temp;
				
			}
				
		}
	}
	
	System.out.println("After sorting: "+Arrays.toString(myArray));
		
	}

}
