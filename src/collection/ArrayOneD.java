package collection;

import java.util.Scanner;

public class ArrayOneD {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("Please enter the String name: ");
//		int arr=Integer.parseInt(sc.next());
		
		int []arr= {10,20,30};
		System.out.println(arr[0]);
		
		int []arr1=new int[10];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the arr1 "+(i+1)+" item:");
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Size of teh array: "+arr1.length);
		
	}

}
