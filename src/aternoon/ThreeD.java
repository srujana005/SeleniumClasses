package aternoon;

public class ThreeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]=new int[3][3][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println("");
			}
		}

	}

}
