package aternoon;

import java.util.Arrays;
import java.util.Collections;

public class Babille_Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {5,1,4,6,8,9,10,7,3,2};
		System.out.println("Before sorting:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting:"+Arrays.toString(a));
		


	}

}
