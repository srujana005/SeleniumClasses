package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=new ArrayList();
		l1.add(38);
		l1.add(45);
		l1.add(89);
		l1.add(90);
		//it l1[0] it will throws abn error
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			int b=l1.get(i);
			System.out.println(b);
			System.out.println(b);
		}
		
 		
	}

}
