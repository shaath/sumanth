package javaprogrames;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3];
		

		//Finding the rows length
		
		System.out.println("Rows Length "+s.length);
		
		//Finding the columns length
		
		System.out.println("Columns length "+s[0].length);
		
		
		//Writing the data into an array
		
		s[0][1]="Selenium";
		s[1][1]="UFT";
		
		//Reading the data from an array
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
		}
		
	}

}
