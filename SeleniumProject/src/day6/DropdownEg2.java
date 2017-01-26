package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fcity=driver.findElement(By.id("fromCity"));
		Select fDrop=new Select(fcity);
		
		List<WebElement> flist=fDrop.getOptions();
		
		System.out.println("The total number od cities available in from Dropdown "+flist.size());
		
		WebElement tcity=driver.findElement(By.id("toCity"));
		Select tDrop=new Select(tcity);
		
		

		for (int i = 0; i < flist.size(); i++)
		{
			fDrop.selectByIndex(i);
			String fc=flist.get(i).getText();
			System.out.println(fc);
			
			List<WebElement> tlist=tDrop.getOptions();
			for (int j = 0; j < tlist.size(); j++) 
			{
				tDrop.selectByIndex(j);
				String tc=tlist.get(j).getText();
				if (fc.equalsIgnoreCase(tc))
				{
					flag=true;
					break;
				}
				
			}
			if (flag==true)
			{
				break;
			}
		}
		
		if (flag==true)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}

}
