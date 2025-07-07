package stringsnn;



public class Words_ucase {

	public static void main(String[] args) {

		String name = "selenium java python";
		
		String[] split = name.split(" ");
		// print all first letter uppercase
		for (String word : split) {
			
			System.out.println("The first letter is:" + word.substring(0, 1).toUpperCase()
					+ word.substring(1, word.length()) + "");
	
	
	  
	  } 
	 
		
	}

}
