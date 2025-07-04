package aternoon;

import java.util.Iterator;

public class DyanmicArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,8,7};
		System.out.println(a[5]);
		/*
		 * instead of writing the size we go for arr.length
		 * for(int i=0;i<=5;i++) { System.out.println(a[i]); } 
		 */
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
