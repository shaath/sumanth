package testNG;

import methods.OrgMaster;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login 
{
	OrgMaster om=new OrgMaster();
	public static String res=null;
	@BeforeMethod
	public void launch()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@Test
	public void login()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	@AfterMethod
	public void logout_Close()
	{
		res=om.org_Logout();
		System.out.println(res);
		om.org_Close();
	}

}
