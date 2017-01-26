package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandle {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();

		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTight(2000);
				System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
				break;
			}
			catch (Exception e)
			{
				System.out.println("The exepected link not available in this page");
			}
			
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
