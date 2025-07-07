package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new	HashSet();
		s1.add(80);
		s1.add(80);
		s1.add(90);
		s1.add(90);
		s1.add(45);
		s1.add(45);
		System.out.println(s1);
		Iterator<Integer> i1=s1.iterator();
		System.out.println(i1.next());
		System.out.println(i1.next());
		System.out.println(i1.next());
	//	System.out.println(i1.next());//it will throw an nosuchelement exception
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		for (Integer integer : s1) {
			System.out.println(integer);
			
		}

	}
	//using for exchloop
	

}
