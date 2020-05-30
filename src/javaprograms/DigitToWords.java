package javaprograms;

import java.util.Scanner;

public class DigitToWords {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Please enter the Num: ");
//		long num=sc.nextLong();
		int num=1024;
		System.out.println("The Numeric number is : "+ num);
		String []numUptotwenty= {
				"Zero", "One","Two", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
				"Eleven", "Tweleve","Thirteen", "Fouteen", "Fifteen", "Seventeen", "Eighteen", "Nineteen", "Twenty" };
		String [] numUpToHundreads= {"Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty", "Hundread"};
		
		
		int get=num%10;
		num/=num/10;
		System.out.println(numUptotwenty[get]);
	}

}
