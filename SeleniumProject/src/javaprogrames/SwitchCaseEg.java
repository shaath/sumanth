package javaprogrames;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="Selenium";
		
		switch(course)
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You ar selected manual");
			break;
		case "UFT":
			System.out.println("You are selected uft");
			break;
		default:
			System.out.println("Select a proper course");
			break;
			
		}

	}

}
