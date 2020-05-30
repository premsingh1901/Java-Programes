package collection;

import java.util.ArrayList;
import java.util.List;

public class RetainedAll {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("First list size: "+l.size());
		List<Integer> l1=new ArrayList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		System.out.println("Second list size: "+l1.size());
		l.retainAll(l1);
		System.out.println("Retaind all: "+l);


		


		
	}

}
