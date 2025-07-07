package stringsnn;

public class First_letter_Ucase_Every {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store the data
				String name=" selenium java python";
				//remove the spaces 
				String s=name.replaceAll("\\{2,}"," ").trim();
				//split the expected data
				String[] split=s.split(" ");
				//print all first letter uppercase
				for(String word:split)
				{
					System.out.println("The first letter is:"+word.substring(0, 1).toUpperCase()+word.
							substring(1, word.length())+"");
							
				}


	}

}
