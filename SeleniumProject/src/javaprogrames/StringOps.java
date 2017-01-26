package javaprogrames;

public class StringOps {

	public static void main(String[] args) 
	{
		String course="malayalam";//  muineleS      dad---dad    malayalam---->malayalam
		String rev="";
		int len=course.length();
		System.out.println(len);
		
//		System.out.println(course.charAt(3));
		
//		for (int i = 0; i < len; i++)
//		{
//			System.out.println(course.charAt(i));
//		}
//		System.out.println("*******");

		for (int i = len-1; i >= 0; i--)
		{
//			System.out.print(course.charAt(i));
			rev=rev+course.charAt(i);
			
		}
		if (course.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is a polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
