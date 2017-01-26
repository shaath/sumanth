package testNG;

import methods.OrgMaster;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Empreg 
{
	OrgMaster om=new OrgMaster();
	public static String res=null;
	@BeforeClass
	public void Launch()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@BeforeMethod
	public void login()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	@Test
	public void empreg()
	{
		res=om.org_Empreg("QEdge", "Tech","20000");
		System.out.println(res);
	}
	@AfterMethod
	public void logout()
	{
		res=om.org_Logout();
		System.out.println(res);
	}
	@AfterClass
	public void close()
	{
		om.org_Close();
	}

}
