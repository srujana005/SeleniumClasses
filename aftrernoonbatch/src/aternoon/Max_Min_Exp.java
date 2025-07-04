package aternoon;

public class Max_Min_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,6,2,51,34,51,22};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
		}
		System.out.println(max);


	}

}
