package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Se1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=new ArrayList();
		l1.add(38);
		l1.add(45);
		l1.add(89);
		l1.add(90);
		l1.add(90);
		//it l1[0] it will throws abn error
		System.out.println(l1);
		Set s1=new HashSet<Integer>(l1);
		System.out.println(s1);
		s1.add(67);
		s1.add(76);
		s1.add(55);
		s1.add(33);
		System.out.println(s1);
		

	}

}
