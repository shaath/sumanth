package javaprogrames;

public class ObjectEg 
{
	public static void main(String[] args) 
	{
		Object[] s={"Selenium",'M',300000,4444.444,true};
		
		System.out.println(s.length);
		
		for (Object x : s)
		{
			System.out.println(x);
			
		}
		
		
	}
}
