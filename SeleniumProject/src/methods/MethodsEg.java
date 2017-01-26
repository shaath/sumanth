package methods;

public class MethodsEg 
{

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
	}
	
	//static Method without returning any value
	
	public static void function1()
	{
		System.out.println("This is Function1 Code");
	}
	//static Method with returning value
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}

	//Non static method without returning value
	
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	//Sum
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
}
