package aternoon;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][4];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=9;
		a[0][3]=10;
		a[1][0]=2;
		a[2][3]=9;
		a[0][3]=5;
		System.out.println(a[0][3]);
		//using foe loop
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
				
		}

	}

}
