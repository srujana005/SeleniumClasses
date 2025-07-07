package aternoon;

import java.util.Arrays;

public class Bobble_Sort_Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,1,4,6,8,9,10,7,3,2};
		System.out.println("Before sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sorting:"+Arrays.toString(a));
		



	}

}
