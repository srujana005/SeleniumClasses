package stringsnn;

public class First_letter_UcaseCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store the data in string
				String name="automation";
				//print expected char Ucase
				String f=name.substring(0,1);
				//print remaining letter's also
				String remain=name.substring(1, name.length());
				//print "A" Upper case
				String first=f.toUpperCase();
				//add both first+remain
				String full=first+remain;
				System.out.println("The name of first letter Ucase:"+full);

	}

}
