package aternoon;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,2,12,35,76,32,88,65,23};
		int len=a.length;
		System.out.println(len);
		//=============================
		//print expected
        System.out.println(a[3]);
        //if we want print all the container number's
       for(int i=0;i<a.length;i++)
       {
    	   //print all the number 
    	   System.out.println(a[i]);
    	 //  print all the positions
    	   System.out.println(i);
       }


	}

}
