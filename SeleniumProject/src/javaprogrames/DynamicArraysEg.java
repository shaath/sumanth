package javaprogrames;

public class DynamicArraysEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[10];
		
		//Finding the length of the array
		
		System.out.println(x.length);
		
		//Writing the data into array
		
		x[5]=40000;
		
		x[8]="Selenium";
		
		x[3]="QEdge";
		
		x[8]="Sharath";
		
		for (Object data : x)
		{
			System.out.println(data);
			
		}
	}

}
