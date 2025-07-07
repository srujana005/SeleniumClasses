package aternoon;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
//static array
		int a[]=new int[5];
		a[0]=1;
		a[3]=9;
		//a[9]=5; it will throw an error like java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[0]);
		System.out.println(a[3]);

		//how to declaring the values at a time
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}

}
