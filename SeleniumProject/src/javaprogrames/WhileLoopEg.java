package javaprogrames;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		while (i<=100)
		{
			System.out.println(i);
			if (i==65) 
			{
				break;
			}
			i++;
		}
		System.out.println("***********");
		int j=100;
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
	}

}
