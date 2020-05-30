package javaprograms;

public class ExceptionHandling1 {
	
	void m1() throws ArithmeticException
	{
		int i=10/0;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		ExceptionHandling1 obj=new ExceptionHandling1();
		try {
			obj.m1();
		}
		catch(ArithmeticException e){
			System.out.println(e);
			//e.printStackTrace();
			
		}
		
		
		
	}

}
