package javaprogrames;

public class StringEg2 
{
	public static void main(String[] args) 
	{
		String c="You are seelcted QEdge";
		String c1="QEdge";
		
//		System.out.println(c.substring(1, 4));
//		
//		System.out.println("Hi"+" Welcome to selenium");
		
//		if(c.equalsIgnoreCase(c1))
//		{
//			System.out.println("Both the strings are same");
//		}
//		else
//		{
//			System.out.println("both the strings are not same");
//		}
		
		if (c.contains(c1))
		{
			System.out.println(c1+" available in "+c);
		}
		else
		{
			System.out.println(c1+" not available in "+c);
		}
		
	}

}
