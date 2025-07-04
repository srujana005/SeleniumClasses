package aternoon;

public class Array3Dimenssional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				//syntax of array
				int[][][] a=new int [2][4][5];
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<3;j++)
					{
						for(int k=0;k<4;k++)
						{
							a[i][j][k]=i+j+k;
							System.out.print(a[i][j][k]+" ");
						}
						System.out.println(" ");
					}
				}

			}

		


	

}
