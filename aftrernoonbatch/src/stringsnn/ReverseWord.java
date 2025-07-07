package stringsnn;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="My First Java Programme";
        System.out.println(s.length());
        String[] str=s.split(" ");
        
        System.out.println(str.length);
        
        String rev=" ";
        
    		for(int i=0;i<str.length;i++)
    		{
    			for(int j=str[i].length()-1;j>=0;j--)
    			{
    				System.out.print(str[i].charAt(j));
    				
    			}
    			System.out.println();
    		}

      
        
   
    	
       System.out.println("\n "); 	
   	 System.out.println( rev+"\n"); 
    	
	}
	
    	
	}


