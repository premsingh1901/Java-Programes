package mostasked;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
			int []myArray= {3,2,5,6,89,7,1,2,4};
			System.out.println("Before sorting: "+Arrays.toString(myArray));
									
			
			
			int len=myArray.length;
			System.out.println("Length of the string is "+len);
			
			for(int i=0;i<len;i++)
			{
				
				for(int j=i+1;j<len;j++)
				{
					
					//System.out.println(myArray[i].compareTo(myArray[j]));
					if(myArray[i]>myArray[j])
					{
									
						int temp=myArray[i];
						myArray[i]=myArray[j];
						myArray[j]=temp;
						
					}
						
				}
			}
			
			System.out.println("After sorting: "+Arrays.toString(myArray));
				
			}
	
	}
	
		
	
