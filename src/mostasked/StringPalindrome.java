package mostasked;
import java.util.Scanner;

class TestRevMethodStringBuffer
{
	boolean flag=false;
	public void rev(String strName)
	{
		StringBuffer newRev=new StringBuffer(strName);
		newRev.reverse();
		String s=new String(newRev);
				if(strName.equals(s))
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			
			if(flag==true)
				System.out.println("String is pallindrome");
			else
				System.out.println("String is not pallindrome");
		}
}


public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the String name: ");
		String strName=sc.nextLine();
		sc.close();
		TestRevMethodStringBuffer objBuffer=new TestRevMethodStringBuffer();
		objBuffer.rev(strName);
		
		
	}

}
