package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		//findElements()
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
//			System.out.println(lText);
			if (!lText.equalsIgnoreCase(""))
			{
				System.out.println(lText);
				count++;
			}
			
		}
		System.out.println("The number of visible links in the page "+count);

	}

}
