package aternoon;

import java.util.Arrays;

public class Equality_Array_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,1,4,61,26,26,1};
	      int[]b= {3,1,4,61,26,26,1};
	      boolean status=Arrays.equals(a,b);
	      int count=a.length;
	      System.out.println(count);
	      
	      if(status==true)
	      {
	    	  System.out.println("both are same");
	      }
	      else
	      {
	    	  System.out.println("both are not same");
	      }
		}

		

	}


