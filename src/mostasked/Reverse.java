package mostasked;
import java.util.Scanner;

/**
 * @author Prem Singh
 *
 */

//Reverse using reverse method
class Test {
	String strName;
	
	void existingMethod(String strName)
	{
		this.strName=strName;
		StringBuffer sb=new StringBuffer(strName);
		System.out.println("Reverse String:"+ sb.reverse());
	}
	
	void usingCharArray(String strName)
	{
		this.strName=strName;
		char []charArr=strName.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
		
	}
	
}
	
public class Reverse
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the String name: ");
		String strName=sc.nextLine();
		sc.close();
		Test obj=new Test();
		obj.existingMethod(strName);
		obj.usingCharArray(strName);
		
		
		
	}

}
