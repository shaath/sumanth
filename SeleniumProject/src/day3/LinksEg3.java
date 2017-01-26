package day3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg3 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();

		
		WebElement block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println("The number of links available in block "+links.size());
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
			
			links.get(i).click();
			Sleeper.sleepTightInSeconds(3);
			System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
			
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Sumanth\\SeleniumProject\\src\\screenshots\\"+lText+".png"));
			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td"));
			links=block.findElements(By.tagName("a"));
		}
		
	}

}
