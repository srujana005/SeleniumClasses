package stringsnn;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"java","python","Ruby","Selenium","java"};
		boolean temp=false;
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					System.out.println("The duplicate:"+name[j]);
					temp=true;
				}
			}
		}

	}

}
