package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusLoginTest
{
	public static WebDriver driver;
	public static String expval,actval;
	@BeforeClass
	public void Launch_Br()
	{
		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void Launch_App()
	{
		expval="Banker Login";
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		actval=driver.findElement(By.xpath(".//*[@id='Table_1101']/tbody/tr[1]/td/div/font")).getText();
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	@Test
	public void Login_App()
	{
		expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		Assert.assertEquals(actval, expval,"Login Failed");

	}
	@AfterMethod
	public void Logout()
	{
		expval="Banker Login";
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		actval=driver.findElement(By.xpath(".//*[@id='Table_1101']/tbody/tr[1]/td/div/font")).getText();
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
